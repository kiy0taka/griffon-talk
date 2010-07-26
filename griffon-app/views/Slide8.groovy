import net.miginfocom.swing.MigLayout

def script = '''application(title:'Sample', pack:true, ...) {
  tableLayout {
    tr {
      td { label('User Name') }
      td { textField(columns:20) }
    }
    tr {
      td { label('Password') }
      td { passwordField(columns:20) }
    }
    tr {
      td(colspan:2, align:'right') { button('Submit') }
    }
  }
}'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("DSL(SwingBuilder)で記述", cssClass: "title", constraints: "wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}