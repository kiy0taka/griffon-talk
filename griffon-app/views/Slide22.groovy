import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("スレッド処理", cssClass: "title", constraints: "center, wrap")
  label("edt, execSync", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    SwingUtilities.invokeAndWait()", cssClass: "desc", constraints: "wrap")
  label("doLater, execAsync", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    SwingUtilities.invokeLater()", cssClass: "desc", constraints: "wrap")
  label("doOutside, execOutside", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    new Thread()", cssClass: "desc", constraints: "wrap")
  label("execFuture", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    ExecutorService.submit()", cssClass: "desc", constraints: "wrap")
  label("isUIThread", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    SwingUtilities.isEventDispatchThread()", cssClass: "desc", constraints: "wrap")
}