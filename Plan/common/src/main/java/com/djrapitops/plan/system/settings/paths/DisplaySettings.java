package com.djrapitops.plan.system.settings.paths;

import com.djrapitops.plan.system.settings.config.ConfigNode;
import com.djrapitops.plan.system.settings.paths.key.BooleanSetting;
import com.djrapitops.plan.system.settings.paths.key.IntegerSetting;
import com.djrapitops.plan.system.settings.paths.key.Setting;
import com.djrapitops.plan.system.settings.paths.key.StringSetting;

/**
 * {@link Setting} values that are in "Display_options" section.
 *
 * @author Rsl1122
 */
public class DisplaySettings {

    public static final Setting<String> THEME = new StringSetting("Display_options.Theme");
    public static final Setting<Boolean> REPLACE_SESSION_ACCORDION_WITH_TABLE = new BooleanSetting("Display_options.Sessions.Replace_accordion_with_table");
    public static final Setting<Integer> SESSIONS_PER_PAGE = new IntegerSetting("Display_options.Sessions.Show_on_page");
    public static final Setting<Boolean> SESSION_MOST_PLAYED_WORLD_IN_TITLE = new BooleanSetting("Display_options.Sessions.Show_most_played_world_in_title");
    public static final Setting<Boolean> ORDER_WORLD_PIE_BY_PERC = new BooleanSetting("Display_options.Sessions.Order_world_pies_by_percentage");
    public static final Setting<Integer> PLAYERS_PER_SERVER_PAGE = new IntegerSetting("Display_options.Players_table.Show_on_server_page");
    public static final Setting<Integer> PLAYERS_PER_PLAYERS_PAGE = new IntegerSetting("Display_options.Players_table.Show_on_players_page");
    public static final Setting<Boolean> PLAYER_IPS = new BooleanSetting("Display_options.Show_player_IPs");
    public static final Setting<Boolean> GAPS_IN_GRAPH_DATA = new BooleanSetting("Display_options.Graphs.Show_gaps_in_data");
    public static final Setting<Integer> GRAPH_TPS_THRESHOLD_HIGH = new IntegerSetting("Display_options.Graphs.TPS.High_threshold");
    public static final Setting<Integer> GRAPH_TPS_THRESHOLD_MED = new IntegerSetting("Display_options.Graphs.TPS.Medium_threshold");
    public static final Setting<Integer> GRAPH_DISK_THRESHOLD_HIGH = new IntegerSetting("Display_options.Graphs.Disk_space.High_threshold");
    public static final Setting<Integer> GRAPH_DISK_THRESHOLD_MED = new IntegerSetting("Display_options.Graphs.Disk_space.Medium_threshold");
    public static final Setting<String> CMD_COLOR_MAIN = new StringSetting("Display_options.Command_colors.Main");
    public static final Setting<String> CMD_COLOR_SECONDARY = new StringSetting("Display_options.Command_colors.Secondary");
    public static final Setting<String> CMD_COLOR_TERTIARY = new StringSetting("Display_options.Command_colors.Highlight");
    public static final Setting<ConfigNode> WORLD_ALIASES = new Setting<ConfigNode>("World_aliases", ConfigNode.class) {
        @Override
        public ConfigNode getValueFrom(ConfigNode node) {
            return node.getNode(path).orElse(node.addNode(path));
        }
    };

    private DisplaySettings() {
        /* static variable class */
    }

}