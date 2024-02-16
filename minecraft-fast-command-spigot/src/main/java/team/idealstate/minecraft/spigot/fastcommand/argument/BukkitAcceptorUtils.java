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

package team.idealstate.minecraft.spigot.fastcommand.argument;

import team.idealstate.hyper.command.api.argument.ArgumentAcceptor;
import team.idealstate.minecraft.spigot.fastcommand.argument.impl.IsOfflinePlayer;
import team.idealstate.minecraft.spigot.fastcommand.argument.impl.IsOnlinePlayer;

/**
 * <p>BukkitAcceptorUtils</p>
 *
 * <p>创建于 2024/2/11 17:03</p>
 *
 * @author ketikai
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class BukkitAcceptorUtils {

    public static ArgumentAcceptor isOnlinePlayer() {
        return IsOnlinePlayer.INSTANCE;
    }

    public static ArgumentAcceptor isOfflinePlayer() {
        return IsOfflinePlayer.INSTANCE;
    }
}
