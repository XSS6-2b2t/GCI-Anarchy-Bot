package com.github.GetForkedNerd.lambdaattack.version.v1_12;

import com.github.GetForkedNerd.lambdaattack.GameVersion;
import com.github.GetForkedNerd.lambdaattack.UniversalProtocol;
import com.github.GetForkedNerd.mc.auth.data.GameProfile;
import com.github.GetForkedNerd.mc.auth.exception.request.RequestException;
import com.github.GetForkedNerd.mc.protocol.MinecraftProtocol;
import com.github.GetForkedNerd.packetlib.packet.PacketProtocol;

import java.net.Proxy;

public class ProtocolWrapper extends MinecraftProtocol implements UniversalProtocol {

    public ProtocolWrapper(String username) {
        super(username);
    }

    public ProtocolWrapper(String username, String password) throws RequestException {
        super(username, password);
    }

    public ProtocolWrapper(String username, String using, boolean token) throws RequestException {
        super(username, using, token);
    }

    public ProtocolWrapper(String username, String using, boolean token, Proxy authProxy) throws RequestException {
        super(username, using, token, authProxy);
    }

    public ProtocolWrapper(GameProfile profile, String accessToken) {
        super(profile, accessToken);
    }

    @Override
    public PacketProtocol getProtocol() {
        return this;
    }

    @Override
    public GameVersion getGameVersion() {
        return GameVersion.VERSION_1_12;
    }
}
