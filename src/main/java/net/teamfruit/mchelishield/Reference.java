package net.teamfruit.mchelishield;

import javax.annotation.Nonnull;

public class Reference {
	public static final @Nonnull String MODID = "mchelishield";
	public static final @Nonnull String NAME = "MC Heli Privacy Shield";
	public static final @Nonnull String VERSION = "${version}";
	public static final @Nonnull String FORGE = "${forgeversion}";
	public static final @Nonnull String MINECRAFT = "${mcversion}";
	public static final @Nonnull String PROXY_SERVER = "net.teamfruit.mchelishield.CommonProxy";
	public static final @Nonnull String PROXY_CLIENT = "net.teamfruit.mchelishield.ClientProxy";
	public static final @Nonnull String GUI_FACTORY = "net.teamfruit.mchelishield.gui.config.ConfigGuiFactory";
}
