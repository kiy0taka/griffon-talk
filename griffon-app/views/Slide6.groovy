import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("Getting Started", cssClass: "title", constraints: "center, wrap")
  textArea('''\
$ griffon create-app Sample
$ cd Sample/
$ griffon run-app''', cssClass: "desc", constraints: "wrap")
  label(icon: imageIcon(resource: "sample-app.png", class: DeckView), cssClass: "desc", constraints: "wrap")
}