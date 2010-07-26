import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("Learn more", cssClass: "title", constraints: "center, wrap")
  label("Griffon Guide", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("   http://dist.codehaus.org/griffon/guide/index.html", cssClass: "desc", constraints: "wrap")
  label("Griffon in Action", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("   http://www.manning.com/almiray/", cssClass: "desc", constraints: "wrap")
  label("Andres Almiray's Weblog", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
      cssClass: "desc", constraints: "wrap")
  label("   http://www.jroller.com/aalmiray/", cssClass: "desc", constraints: "wrap")
  label("Samples", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label('   ${GRIFFON_HOME}/samples', cssClass: "desc", constraints: "wrap")
  label("Plugins", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("   http://svn.codehaus.org/griffon/plugins/", cssClass: "desc", constraints: "wrap")
}