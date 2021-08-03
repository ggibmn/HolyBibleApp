package com.hfad.holybibleapp.data

import com.hfad.holybibleapp.core.Abstract
import com.hfad.holybibleapp.domain.BookDomain

sealed class BookData : Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {
}