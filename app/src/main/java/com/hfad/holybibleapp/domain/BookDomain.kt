package com.hfad.holybibleapp.domain

import com.hfad.holybibleapp.core.Abstract
import com.hfad.holybibleapp.presentation.BookUi

sealed class BookDomain : Abstract.Object<BookUi, Abstract.Mapper.Empty>() {
}