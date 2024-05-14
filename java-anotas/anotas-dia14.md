# Java Swing

- JCheckBox
- JComboBox
- JList
    - JScrollPane
    - Lista mutável -> ListModel ( inserção das String estão no ListModel que é inserido no JList());
    - .getSelectedIndex();
- JTable 
    - into JScrollPane
    - TableModel
- JPanel -> serve para armazenar outros componentes, podendo alterar seu plano de fundo e borda, p.e;
    - JLayeredPane
    - JScrollPane
    - JTabbedPane
- JMenu -> podem receber outros componentes
    - JMenuBar
    - JMenuItem
- JFileChooser -> serve para abrir uma janela com o file manager padrão
    - save and open
- JOptionPane (E/S)
    - showMessageDialog

---
### Gerenciadores de layout
---

Organizam a posição e o tamanho dos componentes dentro de um container. Todo container tem um método `setLayout`. Exemplos:

- FlowLayout
    - Padrão de um JPanel -> insere o componentes em ordem de inserção da esquerda para a direita;

