/*
 *     <one line to give the program's name and a brief idea of what it does.>
 *     Copyright (C) 2024  ideal-state
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package team.idealstate.minecraft.spigot.fastcommand.example.impl;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import team.idealstate.hyper.command.api.CommandContext;
import team.idealstate.hyper.command.api.example.ExampleProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>OnlinePlayersExampleProvider</p>
 *
 * <p>创建于 2024/2/11 17:52</p>
 *
 * @author ketikai
 * @version 1.0.0
 * @since 1.0.0
 */
public final class OnlinePlayersExampleProvider implements ExampleProvider {

    public static final OnlinePlayersExampleProvider INSTANCE = new OnlinePlayersExampleProvider();

    private OnlinePlayersExampleProvider() {
    }

    @Override
    public @NotNull List<String> provideExample(@NotNull CommandContext context) {
        Collection<? extends Player> onlinePlayers = Bukkit.getOnlinePlayers();
        List<String> playerNames = new ArrayList<>(onlinePlayers.size());
        for (Player onlinePlayer : onlinePlayers) {
            playerNames.add(onlinePlayer.getName());
        }
        return playerNames;
    }
}
