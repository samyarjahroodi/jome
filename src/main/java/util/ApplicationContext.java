package util;

import repository.PermissionRepository;
import repository.RoleRepository;
import repository.UserRepository;
import repository.impl.RoleRepositoryImpl;
import repository.impl.UserRepositoryImpl;
import service.PermissionService;
import service.RoleService;
import service.UserService;
import service.impl.RoleServiceImpl;

@SuppressWarnings("unused")
public class ApplicationContext {
    private static final ApplicationContext applicationContext = new ApplicationContext();
    private PermissionRepository permissionRepository;
    private PermissionService permissionService;
    private RoleRepository roleRepository;
    private RoleService roleService;
    private UserRepository userRepository;
    private UserService userService;

    public ApplicationContext() {
    }


    public UserRepository getUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepositoryImpl(
                    DataSource.getConnection()
            );
        }
        return userRepository;
    }


}
