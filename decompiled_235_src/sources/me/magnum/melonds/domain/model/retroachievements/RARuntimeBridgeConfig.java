package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RARuntimeBridgeConfig {
    public static final int $stable = 0;
    private final String apiHost;
    private final String apiToken;
    private final boolean encoreEnabled;
    private final long endpointGeneration;
    private final String gameHash;
    private final Long gameId;
    private final boolean hardcoreEnabled;
    private final RARuntimeBridgeMode runtimeMode;
    private final long submissionSessionId;
    private final boolean unofficialEnabled;
    private final String userAgent;
    private final String username;
    private final boolean usesProxyHost;

    public RARuntimeBridgeConfig(RARuntimeBridgeMode rARuntimeBridgeMode, String str, String str2, String str3, String str4, Long l, long j, boolean z, boolean z2, boolean z3, String str5, boolean z4, long j2) {
        rARuntimeBridgeMode.getClass();
        str5.getClass();
        this.runtimeMode = rARuntimeBridgeMode;
        this.userAgent = str;
        this.username = str2;
        this.apiToken = str3;
        this.gameHash = str4;
        this.gameId = l;
        this.submissionSessionId = j;
        this.hardcoreEnabled = z;
        this.unofficialEnabled = z2;
        this.encoreEnabled = z3;
        this.apiHost = str5;
        this.usesProxyHost = z4;
        this.endpointGeneration = j2;
    }

    public static /* synthetic */ RARuntimeBridgeConfig copy$default(RARuntimeBridgeConfig rARuntimeBridgeConfig, RARuntimeBridgeMode rARuntimeBridgeMode, String str, String str2, String str3, String str4, Long l, long j, boolean z, boolean z2, boolean z3, String str5, boolean z4, long j2, int i, Object obj) {
        long j3;
        RARuntimeBridgeMode rARuntimeBridgeMode2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        String str6;
        String str7;
        String str8;
        String str9;
        Long l2;
        long j4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str10;
        boolean z8;
        RARuntimeBridgeMode rARuntimeBridgeMode3 = (i & 1) != 0 ? rARuntimeBridgeConfig.runtimeMode : rARuntimeBridgeMode;
        String str11 = (i & 2) != 0 ? rARuntimeBridgeConfig.userAgent : str;
        String str12 = (i & 4) != 0 ? rARuntimeBridgeConfig.username : str2;
        String str13 = (i & 8) != 0 ? rARuntimeBridgeConfig.apiToken : str3;
        String str14 = (i & 16) != 0 ? rARuntimeBridgeConfig.gameHash : str4;
        Long l3 = (i & 32) != 0 ? rARuntimeBridgeConfig.gameId : l;
        long j5 = (i & 64) != 0 ? rARuntimeBridgeConfig.submissionSessionId : j;
        boolean z9 = (i & 128) != 0 ? rARuntimeBridgeConfig.hardcoreEnabled : z;
        boolean z10 = (i & 256) != 0 ? rARuntimeBridgeConfig.unofficialEnabled : z2;
        boolean z11 = (i & 512) != 0 ? rARuntimeBridgeConfig.encoreEnabled : z3;
        String str15 = (i & 1024) != 0 ? rARuntimeBridgeConfig.apiHost : str5;
        boolean z12 = (i & 2048) != 0 ? rARuntimeBridgeConfig.usesProxyHost : z4;
        if ((i & 4096) != 0) {
            rARuntimeBridgeMode2 = rARuntimeBridgeMode3;
            j3 = rARuntimeBridgeConfig.endpointGeneration;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            l2 = l3;
            j4 = j5;
            z5 = z9;
            z6 = z10;
            z7 = z11;
            str10 = str15;
            z8 = z12;
            rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
        } else {
            j3 = j2;
            rARuntimeBridgeMode2 = rARuntimeBridgeMode3;
            rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            l2 = l3;
            j4 = j5;
            z5 = z9;
            z6 = z10;
            z7 = z11;
            str10 = str15;
            z8 = z12;
        }
        return rARuntimeBridgeConfig2.copy(rARuntimeBridgeMode2, str6, str7, str8, str9, l2, j4, z5, z6, z7, str10, z8, j3);
    }

    public final RARuntimeBridgeMode component1() {
        return this.runtimeMode;
    }

    public final boolean component10() {
        return this.encoreEnabled;
    }

    public final String component11() {
        return this.apiHost;
    }

    public final boolean component12() {
        return this.usesProxyHost;
    }

    public final long component13() {
        return this.endpointGeneration;
    }

    public final String component2() {
        return this.userAgent;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.apiToken;
    }

    public final String component5() {
        return this.gameHash;
    }

    public final Long component6() {
        return this.gameId;
    }

    public final long component7() {
        return this.submissionSessionId;
    }

    public final boolean component8() {
        return this.hardcoreEnabled;
    }

    public final boolean component9() {
        return this.unofficialEnabled;
    }

    public final RARuntimeBridgeConfig copy(RARuntimeBridgeMode rARuntimeBridgeMode, String str, String str2, String str3, String str4, Long l, long j, boolean z, boolean z2, boolean z3, String str5, boolean z4, long j2) {
        rARuntimeBridgeMode.getClass();
        str5.getClass();
        return new RARuntimeBridgeConfig(rARuntimeBridgeMode, str, str2, str3, str4, l, j, z, z2, z3, str5, z4, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RARuntimeBridgeConfig)) {
            return false;
        }
        RARuntimeBridgeConfig rARuntimeBridgeConfig = (RARuntimeBridgeConfig) obj;
        if (this.runtimeMode == rARuntimeBridgeConfig.runtimeMode && nb3.k(this.userAgent, rARuntimeBridgeConfig.userAgent) && nb3.k(this.username, rARuntimeBridgeConfig.username) && nb3.k(this.apiToken, rARuntimeBridgeConfig.apiToken) && nb3.k(this.gameHash, rARuntimeBridgeConfig.gameHash) && nb3.k(this.gameId, rARuntimeBridgeConfig.gameId) && this.submissionSessionId == rARuntimeBridgeConfig.submissionSessionId && this.hardcoreEnabled == rARuntimeBridgeConfig.hardcoreEnabled && this.unofficialEnabled == rARuntimeBridgeConfig.unofficialEnabled && this.encoreEnabled == rARuntimeBridgeConfig.encoreEnabled && nb3.k(this.apiHost, rARuntimeBridgeConfig.apiHost) && this.usesProxyHost == rARuntimeBridgeConfig.usesProxyHost && this.endpointGeneration == rARuntimeBridgeConfig.endpointGeneration) {
            return true;
        }
        return false;
    }

    public final String getApiHost() {
        return this.apiHost;
    }

    public final String getApiToken() {
        return this.apiToken;
    }

    public final boolean getEncoreEnabled() {
        return this.encoreEnabled;
    }

    public final long getEndpointGeneration() {
        return this.endpointGeneration;
    }

    public final String getGameHash() {
        return this.gameHash;
    }

    public final Long getGameId() {
        return this.gameId;
    }

    public final boolean getHardcoreEnabled() {
        return this.hardcoreEnabled;
    }

    public final RARuntimeBridgeMode getRuntimeMode() {
        return this.runtimeMode;
    }

    public final long getSubmissionSessionId() {
        return this.submissionSessionId;
    }

    public final boolean getUnofficialEnabled() {
        return this.unofficialEnabled;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean getUsesProxyHost() {
        return this.usesProxyHost;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.runtimeMode.hashCode() * 31;
        String str = this.userAgent;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.username;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.apiToken;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.gameHash;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.gameId;
        if (l != null) {
            i = l.hashCode();
        }
        return Long.hashCode(this.endpointGeneration) + xg6.e(xg6.d(xg6.e(xg6.e(xg6.e(i61.c(this.submissionSessionId, (i5 + i) * 31, 31), this.hardcoreEnabled, 31), this.unofficialEnabled, 31), this.encoreEnabled, 31), 31, this.apiHost), this.usesProxyHost, 31);
    }

    public String toString() {
        RARuntimeBridgeMode rARuntimeBridgeMode = this.runtimeMode;
        String str = this.userAgent;
        String str2 = this.username;
        String str3 = this.apiToken;
        String str4 = this.gameHash;
        Long l = this.gameId;
        long j = this.submissionSessionId;
        boolean z = this.hardcoreEnabled;
        boolean z2 = this.unofficialEnabled;
        boolean z3 = this.encoreEnabled;
        String str5 = this.apiHost;
        boolean z4 = this.usesProxyHost;
        long j2 = this.endpointGeneration;
        StringBuilder sb = new StringBuilder("RARuntimeBridgeConfig(runtimeMode=");
        sb.append(rARuntimeBridgeMode);
        sb.append(", userAgent=");
        sb.append(str);
        sb.append(", username=");
        i61.B(sb, str2, ", apiToken=", str3, ", gameHash=");
        sb.append(str4);
        sb.append(", gameId=");
        sb.append(l);
        sb.append(", submissionSessionId=");
        sb.append(j);
        sb.append(", hardcoreEnabled=");
        sb.append(z);
        sb.append(", unofficialEnabled=");
        sb.append(z2);
        sb.append(", encoreEnabled=");
        sb.append(z3);
        sb.append(", apiHost=");
        sb.append(str5);
        sb.append(", usesProxyHost=");
        sb.append(z4);
        return lb1.r(sb, ", endpointGeneration=", j2, ")");
    }
}
