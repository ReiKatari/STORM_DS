package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jj5  reason: default package */
/* loaded from: classes.dex */
public final class jj5 {
    public final cs5 a;
    public final ConsoleType b;
    public final is5 c;
    public final MicSource d;
    public final UUID e;
    public final String f;
    public final String g;
    public final mm5 h;
    public final String i;
    public final boolean j;
    public final ym5 k;
    public final VideoRenderer l;
    public final VideoRenderer m;
    public final Boolean n;
    public final boolean o;
    public final Integer p;
    public final int q;
    public final VideoFiltering r;
    public final VideoFiltering s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;
    public final Boolean y;
    public final boolean z;

    public jj5(cs5 cs5Var, ConsoleType consoleType, is5 is5Var, MicSource micSource, UUID uuid, String str, String str2, mm5 mm5Var, String str3, boolean z, ym5 ym5Var, VideoRenderer videoRenderer, VideoRenderer videoRenderer2, Boolean bool, boolean z2, Integer num, int i, VideoFiltering videoFiltering, VideoFiltering videoFiltering2, String str4, String str5, String str6, String str7, boolean z3, Boolean bool2, boolean z4) {
        cs5Var.getClass();
        consoleType.getClass();
        is5Var.getClass();
        micSource.getClass();
        ym5Var.getClass();
        videoRenderer2.getClass();
        videoFiltering2.getClass();
        this.a = cs5Var;
        this.b = consoleType;
        this.c = is5Var;
        this.d = micSource;
        this.e = uuid;
        this.f = str;
        this.g = str2;
        this.h = mm5Var;
        this.i = str3;
        this.j = z;
        this.k = ym5Var;
        this.l = videoRenderer;
        this.m = videoRenderer2;
        this.n = bool;
        this.o = z2;
        this.p = num;
        this.q = i;
        this.r = videoFiltering;
        this.s = videoFiltering2;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.w = str7;
        this.x = z3;
        this.y = bool2;
        this.z = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jj5) {
                jj5 jj5Var = (jj5) obj;
                if (this.a != jj5Var.a || this.b != jj5Var.b || this.c != jj5Var.c || this.d != jj5Var.d || !b53.x(this.e, jj5Var.e) || !b53.x(this.f, jj5Var.f) || !b53.x(this.g, jj5Var.g) || !this.h.equals(jj5Var.h) || !b53.x(this.i, jj5Var.i) || this.j != jj5Var.j || this.k != jj5Var.k || this.l != jj5Var.l || this.m != jj5Var.m || !b53.x(this.n, jj5Var.n) || this.o != jj5Var.o || !b53.x(this.p, jj5Var.p) || this.q != jj5Var.q || this.r != jj5Var.r || this.s != jj5Var.s || !b53.x(this.t, jj5Var.t) || !b53.x(this.u, jj5Var.u) || !b53.x(this.v, jj5Var.v) || !b53.x(this.w, jj5Var.w) || this.x != jj5Var.x || !b53.x(this.y, jj5Var.y) || this.z != jj5Var.z) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
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
        int hashCode13 = this.b.hashCode();
        int hashCode14 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode13 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        int i = 0;
        UUID uuid = this.e;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int i2 = (hashCode14 + hashCode) * 31;
        String str = this.f;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode15 = (this.h.hashCode() + ((i3 + hashCode3) * 31)) * 31;
        String str3 = this.i;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode16 = (this.k.hashCode() + ej6.c((hashCode15 + hashCode4) * 31, this.j, 31)) * 31;
        VideoRenderer videoRenderer = this.l;
        if (videoRenderer == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = videoRenderer.hashCode();
        }
        int hashCode17 = (this.m.hashCode() + ((hashCode16 + hashCode5) * 31)) * 31;
        Boolean bool = this.n;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int c = ej6.c((hashCode17 + hashCode6) * 31, this.o, 31);
        Integer num = this.p;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int a = wh1.a(this.q, (c + hashCode7) * 31, 31);
        VideoFiltering videoFiltering = this.r;
        if (videoFiltering == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = videoFiltering.hashCode();
        }
        int hashCode18 = (this.s.hashCode() + ((a + hashCode8) * 31)) * 31;
        String str4 = this.t;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i4 = (hashCode18 + hashCode9) * 31;
        String str5 = this.u;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i5 = (i4 + hashCode10) * 31;
        String str6 = this.v;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i6 = (i5 + hashCode11) * 31;
        String str7 = this.w;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int c2 = ej6.c((i6 + hashCode12) * 31, this.x, 31);
        Boolean bool2 = this.y;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return Boolean.hashCode(this.z) + ((c2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RomConfigUiModel(runtimeConsoleType=");
        sb.append(this.a);
        sb.append(", globalRuntimeConsoleType=");
        sb.append(this.b);
        sb.append(", runtimeMicSource=");
        sb.append(this.c);
        sb.append(", globalRuntimeMicSource=");
        sb.append(this.d);
        sb.append(", layoutId=");
        sb.append(this.e);
        sb.append(", layoutName=");
        sb.append(this.f);
        sb.append(", globalLayoutName=");
        sb.append(this.g);
        sb.append(", gbaSlotConfig=");
        sb.append(this.h);
        sb.append(", customName=");
        sb.append(this.i);
        sb.append(", useHgEngineFix=");
        sb.append(this.j);
        sb.append(", inputMode=");
        sb.append(this.k);
        sb.append(", videoRenderer=");
        sb.append(this.l);
        sb.append(", globalVideoRenderer=");
        sb.append(this.m);
        sb.append(", threadedRendering=");
        sb.append(this.n);
        sb.append(", globalThreadedRendering=");
        sb.append(this.o);
        sb.append(", internalResolutionScaling=");
        sb.append(this.p);
        sb.append(", globalInternalResolutionScaling=");
        sb.append(this.q);
        sb.append(", videoFiltering=");
        sb.append(this.r);
        sb.append(", globalVideoFiltering=");
        sb.append(this.s);
        sb.append(", retroArchShaderPresetPath=");
        sb.append(this.t);
        sb.append(", globalRetroArchShaderPresetPath=");
        b31.B(sb, this.u, ", retroArchShaderParameters=", this.v, ", globalRetroArchShaderParameters=");
        sb.append(this.w);
        sb.append(", hasValidRetroArchShaderRoot=");
        sb.append(this.x);
        sb.append(", retroAchievementsEnabled=");
        sb.append(this.y);
        sb.append(", globalRetroAchievementsEnabled=");
        sb.append(this.z);
        sb.append(")");
        return sb.toString();
    }
}
