package util;

import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;

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
