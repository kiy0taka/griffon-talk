import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("アプリケーションを公開する", cssClass: "title", constraints: "center, wrap")
  label("griffon prod package", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  textArea('''\
dist/                      
    applet/
    jar/
    webstart/
    zip/''', editable:false, cssClass: "desc", constraints: "wrap")
}