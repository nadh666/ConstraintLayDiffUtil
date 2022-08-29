package com.amar.constraintlyt
//Model Class in Kotlin code
data class Contactk(val id: Int, val name: String, val date: String, val imageURL: String) {
    object DataSource {
        val contactListKl: List<Contactk>
            get() {
                val contacts = ArrayList<Contactk>()
                contacts.add(Contactk(1, "Teery Mango", "Today", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"))
                contacts.add(Contactk(2, "Ann Dias", "12,July,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"))
                contacts.add(Contactk(3, "Jordyn Bothman", "20,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"))
                contacts.add(Contactk(4, "Manoj Kumar", "18,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"))
                return contacts
            }
    }
}
