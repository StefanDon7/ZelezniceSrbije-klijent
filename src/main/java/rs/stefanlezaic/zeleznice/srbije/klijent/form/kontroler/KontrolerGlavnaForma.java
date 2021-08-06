/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.stefanlezaic.zeleznice.srbije.klijent.form.kontroler;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import rs.stefanlezaic.zeleznice.srbije.klijent.form.GlavnaForma;
import rs.stefanlezaic.zeleznice.srbije.klijent.view.kontroler.KontrolerKorisnik;
import rs.stefanlezaic.zeleznice.srbije.klijent.view.kontroler.KontrolerPretragaPolazaka;
import rs.stefanlezaic.zeleznice.srbije.klijent.view.kontroler.KontrolerRezervacije;
import rs.stefanlezaic.zeleznice.srbije.klijent.view.kontroler.buttons.AbstractMenu;
import rs.stefanlezaic.zeleznice.srbije.lib.domen.Klijent;
import rs.stefanlezaic.zeleznice.srbije.lib.sat.Sat;
import rs.stefanlezaic.zeleznice.srbije.lib.soundEffect.SoundEffect;
import rs.stefanlezaic.zeleznice.srbije.lib.soundEffect.constant.SoundConst;
import rs.stefanlezaic.zeleznice.srbije.lib.theme.Tema;

/**
 *
 * @author Stefan
 */
public class KontrolerGlavnaForma {

    private GlavnaForma glavnaForma;
    private Klijent korisnik;
    private Tema tema;
    private Sat sat;
    private KontrolerPretragaPolazaka kpk;
    private KontrolerKorisnik kk;
    private KontrolerRezervacije kr;
    private KontrolerPocetneForme kontrolerPocetneForme;
    private final SoundEffect soundEffect = new SoundEffect();

    public KontrolerGlavnaForma(Klijent korisnik, KontrolerPocetneForme kontrolerPocetneForme) {
        this.glavnaForma = new GlavnaForma();
        this.korisnik = korisnik;
        this.kontrolerPocetneForme = kontrolerPocetneForme;
        tema = new Tema(glavnaForma);
        ukljuciTamnuTemu();
        glavnaForma.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/srbija1.png")));
        pokreniSat();
        ucitajPotrebneKontrolere();
        otvoriFormu();
        ucitajIkonice();
        pokreniPanelPretraga();
        centrirajFormu();
        menuOdjavaSaDesneStrane();
        addListener();
        glavnaForma.setMinimumSize(new Dimension(1330, 820));
    }

    private void addListener() {
        glavnaForma.menuPretragaActionListener(new AbstractMenu(glavnaForma.getMenuPretraga(), "search", "search1") {
            @Override
            public void execute() {
                menuPretraga();
            }
        });
        glavnaForma.menuNalogActionListener(new AbstractMenu(glavnaForma.getMenuNalog(), "user", "user1") {
            @Override
            public void execute() {
                menuNalog();
            }
        });
        glavnaForma.menuMojeRezervacijeActionListener(new AbstractMenu(glavnaForma.getMenuMojeRezervacije(), "karta", "karta1") {
            @Override
            public void execute() {
                menuRezervacije();
            }
        });
        glavnaForma.menuOdjavaActionListener(new AbstractMenu(glavnaForma.getMenuOdjava(), "logOut", "logOut1") {
            @Override
            public void execute() {
                menuOdjaviSe();
            }
        });

        glavnaForma.lblTamnaTemaActionListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ukljuciTamnuTemu();
                soundEffect.startAudioKlip(SoundConst.BUP);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                soundEffect.startAudioKlip(SoundConst.KLIK);
                glavnaForma.getPanelBar().getPanelTema().getLblDarkMode().
                        setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaSredina.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                glavnaForma.getPanelBar().getPanelTema().getLblDarkMode().
                        setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaCrna.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        glavnaForma.lblSvetlaTemaActionListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ukljuciSvetluTemu();
                soundEffect.startAudioKlip(SoundConst.BUP);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                soundEffect.startAudioKlip(SoundConst.KLIK);
                glavnaForma.getPanelBar().getPanelTema().getLblWhiteMode().
                        setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaSredina.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                glavnaForma.getPanelBar().getPanelTema().getLblWhiteMode().
                        setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaBela.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    private void menuPretraga() {
        pokreniPanelPretraga();
    }

    private void menuNalog() {
        pokreniPanelNalog();
    }

    private void menuRezervacije() {
        pokreniPanelMojeRezervacije();
    }

    private void menuOdjaviSe() {
        glavnaForma.setVisible(false);
        kontrolerPocetneForme.otvoriFormu();
        kontrolerPocetneForme.getKontrolerRegistracija().ocistiFormu();
        kontrolerPocetneForme.getKontrolerUlogujSe().ocistiFormu();
    }

    private void pokreniPanelPretraga() {
        glavnaForma.getPanelKorisnik().setVisible(false);
        glavnaForma.getPanelRezervacije().setVisible(false);
        glavnaForma.getPanelPretragraPolazaka().setVisible(true);
    }

    private void pokreniPanelNalog() {
        glavnaForma.getPanelPretragraPolazaka().setVisible(false);
        glavnaForma.getPanelRezervacije().setVisible(false);
        glavnaForma.getPanelKorisnik().setVisible(true);
    }

    private void pokreniPanelMojeRezervacije() {
        glavnaForma.getPanelPretragraPolazaka().setVisible(false);
        glavnaForma.getPanelKorisnik().setVisible(false);
        glavnaForma.getPanelRezervacije().setVisible(true);
    }

    private void ucitajPotrebneKontrolere() {
        kpk = new KontrolerPretragaPolazaka(glavnaForma, glavnaForma.getPanelPretragraPolazaka(), korisnik);
        kk = new KontrolerKorisnik(glavnaForma, glavnaForma.getPanelKorisnik(), korisnik);
        kr = new KontrolerRezervacije(glavnaForma, glavnaForma.getPanelRezervacije(), korisnik);
    }

    private void menuOdjavaSaDesneStrane() {
        glavnaForma.getMenu().add(Box.createHorizontalGlue());
        glavnaForma.getMenu().add(Box.createHorizontalGlue());
        glavnaForma.getMenu().add(glavnaForma.getMenuOdjava());
    }

    public void otvoriFormu() {
        glavnaForma.setVisible(true);
    }

    public void zatvoriFormu() {
        glavnaForma.setVisible(false);
    }

    private void centrirajFormu() {
        Toolkit toolkit = glavnaForma.getToolkit();
        Dimension size = toolkit.getScreenSize();
        glavnaForma.setLocation(size.width / 2 - glavnaForma.getWidth() / 2, size.height / 2 - glavnaForma.getHeight() / 2);
    }

    public void ukljuciTamnuTemu() {
        glavnaForma.getPanelBar().getPanelTema().getLblWhiteMode().setVisible(true);
        glavnaForma.getPanelBar().getPanelTema().getLblDarkMode().setVisible(false);
        tema.blackTheme();
    }

    public void ukljuciSvetluTemu() {
        glavnaForma.getPanelBar().getPanelTema().getLblWhiteMode().setVisible(false);
        glavnaForma.getPanelBar().getPanelTema().getLblDarkMode().setVisible(true);
        tema.whiteTheme();
    }

    private void pokreniSat() {
        sat = new Sat(glavnaForma.getPanelBar().getPanelSat().getLblVreme(), glavnaForma.getPanelBar().getPanelSat().getLblDatum());
        sat.pokreniSat();
    }

    private void ucitajIkonice() {
        try {
            glavnaForma.getPanelBar().getPanelTema().getLblWhiteMode().
                    setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaBela.png")));
            glavnaForma.getPanelBar().getPanelTema().getLblDarkMode().
                    setIcon(new ImageIcon(getClass().getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/label/temaCrna.png")));
            glavnaForma.getMenuPretraga().setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/menu/search.png")));
            glavnaForma.getMenuNalog().setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/menu/user.png")));
            glavnaForma.getMenuMojeRezervacije().setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/menu/karta.png")));
            glavnaForma.getMenuOdjava().setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/rs/stefanlezaic/zeleznice/srbije/klijent/resources/icons/menu/logOut.png")));
        } catch (Exception e) {
            System.out.println("rs.stefanlezaic.zeleznice.srbije.klijent.form.kontroler;");
        }
    }

}
