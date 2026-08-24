include(FixInterfaceIncludes)

if (ANDROID)
    set(MELONDS_ENABLE_ENET_DEFAULT OFF)
else()
    set(MELONDS_ENABLE_ENET_DEFAULT ON)
endif()

option(MELONDS_ENABLE_ENET "Build ENet LAN/netplay support" ${MELONDS_ENABLE_ENET_DEFAULT})

set(NET_UTILS_SOURCES
    Net.cpp
    Net_PCap.cpp
    Net_Slirp.cpp
    PacketDispatcher.cpp
    LocalMP.cpp
    MPInterface.cpp
)

if (MELONDS_ENABLE_ENET)
    list(APPEND NET_UTILS_SOURCES
        LAN.cpp
        Netplay.cpp)
endif()

add_library(net-utils STATIC ${NET_UTILS_SOURCES})

target_include_directories(net-utils PUBLIC
    "${CMAKE_CURRENT_SOURCE_DIR}"
    "${CMAKE_CURRENT_SOURCE_DIR}/..")

option(USE_SYSTEM_LIBSLIRP "Use system libslirp instead of the bundled version" OFF)
if (USE_SYSTEM_LIBSLIRP)
    pkg_check_modules(Slirp REQUIRED IMPORTED_TARGET slirp)
    fix_interface_includes(PkgConfig::Slirp)
    target_link_libraries(net-utils PUBLIC PkgConfig::Slirp)
else()
    add_subdirectory(libslirp EXCLUDE_FROM_ALL)
    target_link_libraries(net-utils PUBLIC slirp)
endif()

if (MELONDS_ENABLE_ENET)
    if (USE_VCPKG)
        find_package(unofficial-enet CONFIG REQUIRED)
        target_link_libraries(net-utils PRIVATE unofficial::enet::enet)
    else()
        # pkg_check_modules(ENet REQUIRED IMPORTED_TARGET libenet)
        # fix_interface_includes(PkgConfig::ENet)
        # target_link_libraries(net-utils PUBLIC PkgConfig::ENet)
        target_link_libraries(net-utils PUBLIC enet)
    endif()
else()
    target_compile_definitions(net-utils PRIVATE MELONDS_DISABLE_ENET=1)
endif()
