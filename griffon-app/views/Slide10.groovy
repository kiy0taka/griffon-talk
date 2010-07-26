import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("SwingPad", cssClass: "title", constraints: "center, wrap")
  label("SwingBuilder用のWYSIWYGエディタ", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label('$GRIFFON_HOME/samples/SwingPad', icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label(icon: imageIcon(resource: "swingpad.png", class: DeckView),
        cssClass: "desc", constraints: "center, wrap")
}