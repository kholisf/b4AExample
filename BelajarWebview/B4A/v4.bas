B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Label1 As Label
	Private Button1 As Button
	Private ImageView1 As ImageView
	Private lblKamera As Label
	Private Label5 As Label
	Private txtAlamat As EditText
	Private Label4 As Label
	Private btnCobaLagi As Button
	Private Label3 As Label
	Private txtJaket As EditText
	Private txtHelm As EditText
	Private clvOut As CustomListView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("v4")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	
End Sub

Private Sub Label3_Click
	
End Sub