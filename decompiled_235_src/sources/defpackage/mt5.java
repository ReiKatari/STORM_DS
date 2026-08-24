package defpackage;

import android.net.Uri;
import defpackage.v41;
import defpackage.ww5;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt5  reason: default package */
/* loaded from: classes.dex */
public final class mt5 {
    @gc6("runtimeConsoleType")
    private final u26 a;
    @gc6("runtimeMicSource")
    private final a36 b;
    @gc6("layoutId")
    private final String c;
    @gc6("gbaSlotConfig")
    private final ww5 d;
    @gc6("customName")
    private final String e;
    @gc6(alternate = {"useHgInputWorkaround"}, value = "useHgEngineFix")
    private final Boolean f;
    @gc6("inputMode")
    private final nx5 g;
    @gc6("customControllerConfiguration")
    private final v41 h;
    @gc6("videoRenderer")
    private final VideoRenderer i;
    @gc6("threadedRendering")
    private final Boolean j;
    @gc6("internalResolutionScaling")
    private final Integer k;
    @gc6("videoFiltering")
    private final VideoFiltering l;
    @gc6("retroArchShaderPresetPath")
    private final String m;
    @gc6("retroArchShaderParameters")
    private final String n;
    @gc6("retroAchievementsEnabled")
    private final Boolean o;
    @gc6("dualScreenPreset")
    private final jq1 p;
    @gc6("dualScreenKeepAspectRatio")
    private final Boolean q;
    @gc6("dualScreenIntegerScale")
    private final Boolean r;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: mt5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static mt5 a(jt5 jt5Var) {
            String str;
            ww5.b bVar;
            sw5 sw5Var;
            String str2;
            sw5 sw5Var2;
            String str3;
            Uri uri;
            Uri uri2;
            jt5Var.getClass();
            u26 u26Var = jt5Var.a;
            a36 a36Var = jt5Var.b;
            UUID uuid = jt5Var.c;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            hi2 hi2Var = jt5Var.d;
            hi2Var.getClass();
            if (hi2Var.equals(uw5.o)) {
                bVar = ww5.b.None;
            } else if (hi2Var instanceof sw5) {
                bVar = ww5.b.GbaRom;
            } else if (hi2Var.equals(vw5.o)) {
                bVar = ww5.b.RumblePak;
            } else if (hi2Var.equals(tw5.o)) {
                bVar = ww5.b.MemoryExpansion;
            } else if (hi2Var.equals(rw5.o)) {
                bVar = ww5.b.AnalogInput;
            } else {
                i.d();
                return null;
            }
            boolean z = hi2Var instanceof sw5;
            if (z) {
                sw5Var = (sw5) hi2Var;
            } else {
                sw5Var = null;
            }
            if (sw5Var != null && (uri2 = sw5Var.o) != null) {
                str2 = uri2.toString();
            } else {
                str2 = null;
            }
            if (z) {
                sw5Var2 = (sw5) hi2Var;
            } else {
                sw5Var2 = null;
            }
            if (sw5Var2 != null && (uri = sw5Var2.p) != null) {
                str3 = uri.toString();
            } else {
                str3 = null;
            }
            ww5 ww5Var = new ww5(bVar, str2, str3);
            String str4 = jt5Var.e;
            Boolean valueOf = Boolean.valueOf(jt5Var.f);
            v41 v41Var = null;
            nx5 nx5Var = jt5Var.g;
            u41 u41Var = jt5Var.h;
            if (u41Var != null) {
                v41.Companion.getClass();
                v41Var = v41.b.a(u41Var);
            }
            return new mt5(u26Var, a36Var, str, ww5Var, str4, valueOf, nx5Var, v41Var, jt5Var.i, jt5Var.j, jt5Var.k, jt5Var.l, jt5Var.m, jt5Var.n, jt5Var.o, jt5Var.p, jt5Var.q, jt5Var.r);
        }
    }

    public mt5(u26 u26Var, a36 a36Var, String str, ww5 ww5Var, String str2, Boolean bool, nx5 nx5Var, v41 v41Var, VideoRenderer videoRenderer, Boolean bool2, Integer num, VideoFiltering videoFiltering, String str3, String str4, Boolean bool3, jq1 jq1Var, Boolean bool4, Boolean bool5) {
        u26Var.getClass();
        a36Var.getClass();
        this.a = u26Var;
        this.b = a36Var;
        this.c = str;
        this.d = ww5Var;
        this.e = str2;
        this.f = bool;
        this.g = nx5Var;
        this.h = v41Var;
        this.i = videoRenderer;
        this.j = bool2;
        this.k = num;
        this.l = videoFiltering;
        this.m = str3;
        this.n = str4;
        this.o = bool3;
        this.p = jq1Var;
        this.q = bool4;
        this.r = bool5;
    }

    public static mt5 a(mt5 mt5Var, u26 u26Var) {
        a36 a36Var = mt5Var.b;
        String str = mt5Var.c;
        ww5 ww5Var = mt5Var.d;
        String str2 = mt5Var.e;
        Boolean bool = mt5Var.f;
        nx5 nx5Var = mt5Var.g;
        v41 v41Var = mt5Var.h;
        VideoRenderer videoRenderer = mt5Var.i;
        Boolean bool2 = mt5Var.j;
        Integer num = mt5Var.k;
        VideoFiltering videoFiltering = mt5Var.l;
        String str3 = mt5Var.m;
        String str4 = mt5Var.n;
        Boolean bool3 = mt5Var.o;
        jq1 jq1Var = mt5Var.p;
        Boolean bool4 = mt5Var.q;
        Boolean bool5 = mt5Var.r;
        mt5Var.getClass();
        u26Var.getClass();
        a36Var.getClass();
        ww5Var.getClass();
        return new mt5(u26Var, a36Var, str, ww5Var, str2, bool, nx5Var, v41Var, videoRenderer, bool2, num, videoFiltering, str3, str4, bool3, jq1Var, bool4, bool5);
    }

    public final jt5 b() {
        UUID uuid;
        boolean z;
        u26 u26Var = this.a;
        a36 a36Var = this.b;
        String str = this.c;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        hi2 a2 = this.d.a();
        u41 u41Var = null;
        String str2 = this.e;
        Boolean bool = this.f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        nx5 nx5Var = this.g;
        if (nx5Var == null) {
            nx5Var = nx5.GLOBAL;
        }
        v41 v41Var = this.h;
        if (v41Var != null) {
            u41Var = v41Var.a();
        }
        return new jt5(u26Var, a36Var, uuid, a2, str2, z, nx5Var, u41Var, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt5)) {
            return false;
        }
        mt5 mt5Var = (mt5) obj;
        if (this.a == mt5Var.a && this.b == mt5Var.b && nb3.k(this.c, mt5Var.c) && nb3.k(this.d, mt5Var.d) && nb3.k(this.e, mt5Var.e) && nb3.k(this.f, mt5Var.f) && this.g == mt5Var.g && nb3.k(this.h, mt5Var.h) && this.i == mt5Var.i && nb3.k(this.j, mt5Var.j) && nb3.k(this.k, mt5Var.k) && this.l == mt5Var.l && nb3.k(this.m, mt5Var.m) && nb3.k(this.n, mt5Var.n) && nb3.k(this.o, mt5Var.o) && this.p == mt5Var.p && nb3.k(this.q, mt5Var.q) && nb3.k(this.r, mt5Var.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode16 = (this.d.hashCode() + ((hashCode15 + hashCode) * 31)) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode16 + hashCode2) * 31;
        Boolean bool = this.f;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        nx5 nx5Var = this.g;
        if (nx5Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = nx5Var.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        v41 v41Var = this.h;
        if (v41Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = v41Var.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        VideoRenderer videoRenderer = this.i;
        if (videoRenderer == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = videoRenderer.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Boolean bool2 = this.j;
        if (bool2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool2.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Integer num = this.k;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        VideoFiltering videoFiltering = this.l;
        if (videoFiltering == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = videoFiltering.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str3 = this.m;
        if (str3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str3.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str4 = this.n;
        if (str4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str4.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        Boolean bool3 = this.o;
        if (bool3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool3.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        jq1 jq1Var = this.p;
        if (jq1Var == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = jq1Var.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        Boolean bool4 = this.q;
        if (bool4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool4.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        Boolean bool5 = this.r;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return i14 + i;
    }

    public final String toString() {
        u26 u26Var = this.a;
        a36 a36Var = this.b;
        String str = this.c;
        ww5 ww5Var = this.d;
        String str2 = this.e;
        Boolean bool = this.f;
        nx5 nx5Var = this.g;
        v41 v41Var = this.h;
        VideoRenderer videoRenderer = this.i;
        Boolean bool2 = this.j;
        Integer num = this.k;
        VideoFiltering videoFiltering = this.l;
        String str3 = this.m;
        String str4 = this.n;
        Boolean bool3 = this.o;
        jq1 jq1Var = this.p;
        Boolean bool4 = this.q;
        Boolean bool5 = this.r;
        StringBuilder sb = new StringBuilder("RomConfigDto(runtimeConsoleType=");
        sb.append(u26Var);
        sb.append(", runtimeMicSource=");
        sb.append(a36Var);
        sb.append(", layoutId=");
        sb.append(str);
        sb.append(", gbaSlotConfig=");
        sb.append(ww5Var);
        sb.append(", customName=");
        sb.append(str2);
        sb.append(", useHgEngineFix=");
        sb.append(bool);
        sb.append(", inputMode=");
        sb.append(nx5Var);
        sb.append(", customControllerConfiguration=");
        sb.append(v41Var);
        sb.append(", videoRenderer=");
        sb.append(videoRenderer);
        sb.append(", threadedRendering=");
        sb.append(bool2);
        sb.append(", internalResolutionScaling=");
        sb.append(num);
        sb.append(", videoFiltering=");
        sb.append(videoFiltering);
        sb.append(", retroArchShaderPresetPath=");
        i61.B(sb, str3, ", retroArchShaderParameters=", str4, ", retroAchievementsEnabled=");
        sb.append(bool3);
        sb.append(", dualScreenPreset=");
        sb.append(jq1Var);
        sb.append(", dualScreenKeepAspectRatio=");
        sb.append(bool4);
        sb.append(", dualScreenIntegerScale=");
        sb.append(bool5);
        sb.append(")");
        return sb.toString();
    }
}
