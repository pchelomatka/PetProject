package main.service.mapper;

import main.domain.Library;
import main.domain.dto.LibraryDTO;
import main.repository.LibraryRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class LibraryMapper {

    private LibraryRepository libraryRepository;
    LibraryMapper INSTANCE = Mappers.getMapper(LibraryMapper.class);


    @Mapping(source = "library.id", target = "libraryId")
    @Mapping(source = "library.name", target = "libraryName")
    @Mapping(source = "library.address", target = "libraryAddress")
    public abstract LibraryDTO libraryToLibraryDTO(Library library);

    @Mapping(source = "libraryId", target = "library")
    public abstract Library libraryDTOToLibrary(LibraryDTO libraryDTO);


}
