import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("インストール", cssClass: "title", constraints: "center, wrap")
  label("zipをダウンロードして展開", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("環境変数設定", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    GRIFFON_HOMEの設定", cssClass: "desc", constraints: "wrap")
  label('    PATHに$GRIFFON_HOME/binを追加', cssClass: "desc", constraints: "wrap")
  textArea('''\
$ griffon help
Welcome to Griffon 0.3.1 - http://griffon.codehaus.org/
Licensed under Apache Standard License 2.0
Griffon home is set to: /usr/local/griffon/current
...''', cssClass: "desc", constraints: "wrap")
}