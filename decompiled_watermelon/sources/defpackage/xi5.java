package defpackage;

import android.net.Uri;
import defpackage.hm5;
import defpackage.n11;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xi5  reason: default package */
/* loaded from: classes.dex */
public final class xi5 {
    @r06("runtimeConsoleType")
    private final cs5 a;
    @r06("runtimeMicSource")
    private final is5 b;
    @r06("layoutId")
    private final String c;
    @r06("gbaSlotConfig")
    private final hm5 d;
    @r06("customName")
    private final String e;
    @r06(alternate = {"useHgInputWorkaround"}, value = "useHgEngineFix")
    private final Boolean f;
    @r06("inputMode")
    private final ym5 g;
    @r06("customControllerConfiguration")
    private final n11 h;
    @r06("videoRenderer")
    private final VideoRenderer i;
    @r06("threadedRendering")
    private final Boolean j;
    @r06("internalResolutionScaling")
    private final Integer k;
    @r06("videoFiltering")
    private final VideoFiltering l;
    @r06("retroArchShaderPresetPath")
    private final String m;
    @r06("retroArchShaderParameters")
    private final String n;
    @r06("retroAchievementsEnabled")
    private final Boolean o;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: xi5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static xi5 a(ti5 ti5Var) {
            String str;
            hm5.b bVar;
            dm5 dm5Var;
            String str2;
            dm5 dm5Var2;
            String str3;
            Uri uri;
            Uri uri2;
            ti5Var.getClass();
            cs5 cs5Var = ti5Var.a;
            is5 is5Var = ti5Var.b;
            UUID uuid = ti5Var.c;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            me2 me2Var = ti5Var.d;
            me2Var.getClass();
            if (me2Var.equals(fm5.d)) {
                bVar = hm5.b.None;
            } else if (me2Var instanceof dm5) {
                bVar = hm5.b.GbaRom;
            } else if (me2Var.equals(gm5.d)) {
                bVar = hm5.b.RumblePak;
            } else if (me2Var.equals(em5.d)) {
                bVar = hm5.b.MemoryExpansion;
            } else if (me2Var.equals(cm5.d)) {
                bVar = hm5.b.AnalogInput;
            } else {
                i.c();
                return null;
            }
            boolean z = me2Var instanceof dm5;
            if (z) {
                dm5Var = (dm5) me2Var;
            } else {
                dm5Var = null;
            }
            if (dm5Var != null && (uri2 = dm5Var.d) != null) {
                str2 = uri2.toString();
            } else {
                str2 = null;
            }
            if (z) {
                dm5Var2 = (dm5) me2Var;
            } else {
                dm5Var2 = null;
            }
            if (dm5Var2 != null && (uri = dm5Var2.e) != null) {
                str3 = uri.toString();
            } else {
                str3 = null;
            }
            hm5 hm5Var = new hm5(bVar, str2, str3);
            String str4 = ti5Var.e;
            Boolean valueOf = Boolean.valueOf(ti5Var.f);
            n11 n11Var = null;
            ym5 ym5Var = ti5Var.g;
            m11 m11Var = ti5Var.h;
            if (m11Var != null) {
                n11.Companion.getClass();
                n11Var = n11.b.a(m11Var);
            }
            return new xi5(cs5Var, is5Var, str, hm5Var, str4, valueOf, ym5Var, n11Var, ti5Var.i, ti5Var.j, ti5Var.k, ti5Var.l, ti5Var.m, ti5Var.n, ti5Var.o);
        }
    }

    public xi5(cs5 cs5Var, is5 is5Var, String str, hm5 hm5Var, String str2, Boolean bool, ym5 ym5Var, n11 n11Var, VideoRenderer videoRenderer, Boolean bool2, Integer num, VideoFiltering videoFiltering, String str3, String str4, Boolean bool3) {
        cs5Var.getClass();
        is5Var.getClass();
        this.a = cs5Var;
        this.b = is5Var;
        this.c = str;
        this.d = hm5Var;
        this.e = str2;
        this.f = bool;
        this.g = ym5Var;
        this.h = n11Var;
        this.i = videoRenderer;
        this.j = bool2;
        this.k = num;
        this.l = videoFiltering;
        this.m = str3;
        this.n = str4;
        this.o = bool3;
    }

    public static xi5 a(xi5 xi5Var, cs5 cs5Var) {
        is5 is5Var = xi5Var.b;
        String str = xi5Var.c;
        hm5 hm5Var = xi5Var.d;
        String str2 = xi5Var.e;
        Boolean bool = xi5Var.f;
        ym5 ym5Var = xi5Var.g;
        n11 n11Var = xi5Var.h;
        VideoRenderer videoRenderer = xi5Var.i;
        Boolean bool2 = xi5Var.j;
        Integer num = xi5Var.k;
        VideoFiltering videoFiltering = xi5Var.l;
        String str3 = xi5Var.m;
        String str4 = xi5Var.n;
        Boolean bool3 = xi5Var.o;
        xi5Var.getClass();
        cs5Var.getClass();
        is5Var.getClass();
        hm5Var.getClass();
        return new xi5(cs5Var, is5Var, str, hm5Var, str2, bool, ym5Var, n11Var, videoRenderer, bool2, num, videoFiltering, str3, str4, bool3);
    }

    public final ti5 b() {
        UUID uuid;
        boolean z;
        cs5 cs5Var = this.a;
        is5 is5Var = this.b;
        String str = this.c;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        me2 a2 = this.d.a();
        m11 m11Var = null;
        String str2 = this.e;
        Boolean bool = this.f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        ym5 ym5Var = this.g;
        if (ym5Var == null) {
            ym5Var = ym5.GLOBAL;
        }
        n11 n11Var = this.h;
        if (n11Var != null) {
            m11Var = n11Var.a();
        }
        return new ti5(cs5Var, is5Var, uuid, a2, str2, z, ym5Var, m11Var, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi5)) {
            return false;
        }
        xi5 xi5Var = (xi5) obj;
        if (this.a == xi5Var.a && this.b == xi5Var.b && b53.x(this.c, xi5Var.c) && b53.x(this.d, xi5Var.d) && b53.x(this.e, xi5Var.e) && b53.x(this.f, xi5Var.f) && this.g == xi5Var.g && b53.x(this.h, xi5Var.h) && this.i == xi5Var.i && b53.x(this.j, xi5Var.j) && b53.x(this.k, xi5Var.k) && this.l == xi5Var.l && b53.x(this.m, xi5Var.m) && b53.x(this.n, xi5Var.n) && b53.x(this.o, xi5Var.o)) {
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
        int hashCode12 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode13 = (this.d.hashCode() + ((hashCode12 + hashCode) * 31)) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode13 + hashCode2) * 31;
        Boolean bool = this.f;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        ym5 ym5Var = this.g;
        if (ym5Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ym5Var.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        n11 n11Var = this.h;
        if (n11Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = n11Var.hashCode();
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
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        cs5 cs5Var = this.a;
        is5 is5Var = this.b;
        String str = this.c;
        hm5 hm5Var = this.d;
        String str2 = this.e;
        Boolean bool = this.f;
        ym5 ym5Var = this.g;
        n11 n11Var = this.h;
        VideoRenderer videoRenderer = this.i;
        Boolean bool2 = this.j;
        Integer num = this.k;
        VideoFiltering videoFiltering = this.l;
        String str3 = this.m;
        String str4 = this.n;
        Boolean bool3 = this.o;
        StringBuilder sb = new StringBuilder("RomConfigDto(runtimeConsoleType=");
        sb.append(cs5Var);
        sb.append(", runtimeMicSource=");
        sb.append(is5Var);
        sb.append(", layoutId=");
        sb.append(str);
        sb.append(", gbaSlotConfig=");
        sb.append(hm5Var);
        sb.append(", customName=");
        sb.append(str2);
        sb.append(", useHgEngineFix=");
        sb.append(bool);
        sb.append(", inputMode=");
        sb.append(ym5Var);
        sb.append(", customControllerConfiguration=");
        sb.append(n11Var);
        sb.append(", videoRenderer=");
        sb.append(videoRenderer);
        sb.append(", threadedRendering=");
        sb.append(bool2);
        sb.append(", internalResolutionScaling=");
        sb.append(num);
        sb.append(", videoFiltering=");
        sb.append(videoFiltering);
        sb.append(", retroArchShaderPresetPath=");
        b31.B(sb, str3, ", retroArchShaderParameters=", str4, ", retroAchievementsEnabled=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }
}
