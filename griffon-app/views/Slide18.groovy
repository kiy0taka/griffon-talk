import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill ","5%[left]5%","")) {
 label("Event Dispatch Thread", cssClass: "title", constraints: "center, wrap")
 label("イベントをディスパッチするスレッド", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
       cssClass: "desc", constraints: "wrap")
 label("Swingは基本的にスレッドセーフではない", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
       cssClass: "desc", constraints: "wrap")
 label('    Swingコンポーネントの状態を扱う処理は', cssClass: "code", constraints: "wrap")
 label('    すべてEDT上で行う必要がある', cssClass: "code", constraints: "wrap")
 label("リスナー系のメソッドはEDT上で実行される", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
       cssClass: "desc", constraints: "wrap")
 label('${javadoc}/javax/swing/package-summary.html', cssClass: "code", constraints: "wrap")
}