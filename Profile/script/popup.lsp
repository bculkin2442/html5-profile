(let* 
 (
  (open (method window "open"))
  (nav (get window "navigator"))
  (url (get navigator "href")) 
  (bttn (getElement "popup-button"))
  (bthn (lambda () ((open url))))
 )
 (set bttn "onclick" (export bthn))
)