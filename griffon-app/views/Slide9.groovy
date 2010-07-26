import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("SwingBuilder", cssClass: "title", constraints: "center, wrap")
  label("groovy.swing.SwingBuilder", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("javax.swing.JXxx -> xxx()", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    JButton -> button()", cssClass: "desc", constraints: "wrap")
  label("    JLabel -> label()", cssClass: "desc", constraints: "wrap")
  label('http://groovy.codehaus.org/Alphabetical+Widgets+List', cssClass: "desc", constraints: "wrap")
}