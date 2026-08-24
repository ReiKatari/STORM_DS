package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt5  reason: default package */
/* loaded from: classes.dex */
public final class zt5 {
    public final jq1 A;
    public final Boolean B;
    public final Boolean C;
    public final u26 a;
    public final ConsoleType b;
    public final a36 c;
    public final MicSource d;
    public final UUID e;
    public final String f;
    public final String g;
    public final bx5 h;
    public final String i;
    public final boolean j;
    public final nx5 k;
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

    public zt5(u26 u26Var, ConsoleType consoleType, a36 a36Var, MicSource micSource, UUID uuid, String str, String str2, bx5 bx5Var, String str3, boolean z, nx5 nx5Var, VideoRenderer videoRenderer, VideoRenderer videoRenderer2, Boolean bool, boolean z2, Integer num, int i, VideoFiltering videoFiltering, VideoFiltering videoFiltering2, String str4, String str5, String str6, String str7, boolean z3, Boolean bool2, boolean z4, jq1 jq1Var, Boolean bool3, Boolean bool4) {
        u26Var.getClass();
        consoleType.getClass();
        a36Var.getClass();
        micSource.getClass();
        nx5Var.getClass();
        videoRenderer2.getClass();
        videoFiltering2.getClass();
        this.a = u26Var;
        this.b = consoleType;
        this.c = a36Var;
        this.d = micSource;
        this.e = uuid;
        this.f = str;
        this.g = str2;
        this.h = bx5Var;
        this.i = str3;
        this.j = z;
        this.k = nx5Var;
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
        this.A = jq1Var;
        this.B = bool3;
        this.C = bool4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zt5) {
                zt5 zt5Var = (zt5) obj;
                if (this.a != zt5Var.a || this.b != zt5Var.b || this.c != zt5Var.c || this.d != zt5Var.d || !nb3.k(this.e, zt5Var.e) || !nb3.k(this.f, zt5Var.f) || !nb3.k(this.g, zt5Var.g) || !this.h.equals(zt5Var.h) || !nb3.k(this.i, zt5Var.i) || this.j != zt5Var.j || this.k != zt5Var.k || this.l != zt5Var.l || this.m != zt5Var.m || !nb3.k(this.n, zt5Var.n) || this.o != zt5Var.o || !nb3.k(this.p, zt5Var.p) || this.q != zt5Var.q || this.r != zt5Var.r || this.s != zt5Var.s || !nb3.k(this.t, zt5Var.t) || !nb3.k(this.u, zt5Var.u) || !nb3.k(this.v, zt5Var.v) || !nb3.k(this.w, zt5Var.w) || this.x != zt5Var.x || !nb3.k(this.y, zt5Var.y) || this.z != zt5Var.z || this.A != zt5Var.A || !nb3.k(this.B, zt5Var.B) || !nb3.k(this.C, zt5Var.C)) {
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
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16 = this.b.hashCode();
        int hashCode17 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode16 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        int i = 0;
        UUID uuid = this.e;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int i2 = (hashCode17 + hashCode) * 31;
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
        int hashCode18 = (this.h.hashCode() + ((i3 + hashCode3) * 31)) * 31;
        String str3 = this.i;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode19 = (this.k.hashCode() + xg6.e((hashCode18 + hashCode4) * 31, this.j, 31)) * 31;
        VideoRenderer videoRenderer = this.l;
        if (videoRenderer == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = videoRenderer.hashCode();
        }
        int hashCode20 = (this.m.hashCode() + ((hashCode19 + hashCode5) * 31)) * 31;
        Boolean bool = this.n;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int e = xg6.e((hashCode20 + hashCode6) * 31, this.o, 31);
        Integer num = this.p;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int a = lb1.a(this.q, (e + hashCode7) * 31, 31);
        VideoFiltering videoFiltering = this.r;
        if (videoFiltering == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = videoFiltering.hashCode();
        }
        int hashCode21 = (this.s.hashCode() + ((a + hashCode8) * 31)) * 31;
        String str4 = this.t;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i4 = (hashCode21 + hashCode9) * 31;
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
        int e2 = xg6.e((i6 + hashCode12) * 31, this.x, 31);
        Boolean bool2 = this.y;
        if (bool2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool2.hashCode();
        }
        int e3 = xg6.e((e2 + hashCode13) * 31, this.z, 31);
        jq1 jq1Var = this.A;
        if (jq1Var == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = jq1Var.hashCode();
        }
        int i7 = (e3 + hashCode14) * 31;
        Boolean bool3 = this.B;
        if (bool3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool3.hashCode();
        }
        int i8 = (i7 + hashCode15) * 31;
        Boolean bool4 = this.C;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return i8 + i;
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
        i61.B(sb, this.u, ", retroArchShaderParameters=", this.v, ", globalRetroArchShaderParameters=");
        sb.append(this.w);
        sb.append(", hasValidRetroArchShaderRoot=");
        sb.append(this.x);
        sb.append(", retroAchievementsEnabled=");
        sb.append(this.y);
        sb.append(", globalRetroAchievementsEnabled=");
        sb.append(this.z);
        sb.append(", dualScreenPreset=");
        sb.append(this.A);
        sb.append(", dualScreenKeepAspectRatio=");
        sb.append(this.B);
        sb.append(", dualScreenIntegerScale=");
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }
}
