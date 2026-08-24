package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt5  reason: default package */
/* loaded from: classes.dex */
public final class jt5 {
    public final u26 a;
    public final a36 b;
    public final UUID c;
    public final hi2 d;
    public final String e;
    public final boolean f;
    public final nx5 g;
    public final u41 h;
    public final VideoRenderer i;
    public final Boolean j;
    public final Integer k;
    public final VideoFiltering l;
    public final String m;
    public final String n;
    public final Boolean o;
    public final jq1 p;
    public final Boolean q;
    public final Boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ jt5(u26 u26Var, a36 a36Var, UUID uuid, hi2 hi2Var, String str, boolean z, nx5 nx5Var, u41 u41Var, VideoRenderer videoRenderer, Boolean bool, Integer num, VideoFiltering videoFiltering, String str2, String str3, int i) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, null, null, null, null);
        u26 u26Var2;
        a36 a36Var2;
        UUID uuid2;
        uw5 uw5Var;
        String str4;
        boolean z2;
        nx5 nx5Var2;
        u41 u41Var2;
        VideoRenderer videoRenderer2;
        Boolean bool2;
        Integer num2;
        VideoFiltering videoFiltering2;
        String str5;
        String str6;
        if ((i & 1) != 0) {
            u26Var2 = u26.DEFAULT;
        } else {
            u26Var2 = u26Var;
        }
        if ((i & 2) != 0) {
            a36Var2 = a36.DEFAULT;
        } else {
            a36Var2 = a36Var;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        } else {
            uuid2 = uuid;
        }
        if ((i & 8) != 0) {
            uw5Var = uw5.o;
        } else {
            uw5Var = hi2Var;
        }
        if ((i & 16) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 64) != 0) {
            nx5Var2 = nx5.GLOBAL;
        } else {
            nx5Var2 = nx5Var;
        }
        if ((i & 128) != 0) {
            u41Var2 = null;
        } else {
            u41Var2 = u41Var;
        }
        if ((i & 256) != 0) {
            videoRenderer2 = null;
        } else {
            videoRenderer2 = videoRenderer;
        }
        if ((i & 512) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 1024) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 2048) != 0) {
            videoFiltering2 = null;
        } else {
            videoFiltering2 = videoFiltering;
        }
        if ((i & 4096) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 8192) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
    }

    public static jt5 a(jt5 jt5Var, u26 u26Var, a36 a36Var, UUID uuid, hi2 hi2Var, String str, boolean z, nx5 nx5Var, u41 u41Var, VideoRenderer videoRenderer, Boolean bool, Integer num, VideoFiltering videoFiltering, String str2, String str3, Boolean bool2, jq1 jq1Var, Boolean bool3, Boolean bool4, int i) {
        u26 u26Var2 = (i & 1) != 0 ? jt5Var.a : u26Var;
        a36 a36Var2 = (i & 2) != 0 ? jt5Var.b : a36Var;
        UUID uuid2 = (i & 4) != 0 ? jt5Var.c : uuid;
        hi2 hi2Var2 = (i & 8) != 0 ? jt5Var.d : hi2Var;
        String str4 = (i & 16) != 0 ? jt5Var.e : str;
        boolean z2 = (i & 32) != 0 ? jt5Var.f : z;
        nx5 nx5Var2 = (i & 64) != 0 ? jt5Var.g : nx5Var;
        u41 u41Var2 = (i & 128) != 0 ? jt5Var.h : u41Var;
        VideoRenderer videoRenderer2 = (i & 256) != 0 ? jt5Var.i : videoRenderer;
        Boolean bool5 = (i & 512) != 0 ? jt5Var.j : bool;
        Integer num2 = (i & 1024) != 0 ? jt5Var.k : num;
        VideoFiltering videoFiltering2 = (i & 2048) != 0 ? jt5Var.l : videoFiltering;
        String str5 = (i & 4096) != 0 ? jt5Var.m : str2;
        String str6 = (i & 8192) != 0 ? jt5Var.n : str3;
        u26 u26Var3 = u26Var2;
        Boolean bool6 = (i & 16384) != 0 ? jt5Var.o : bool2;
        jq1 jq1Var2 = (i & 32768) != 0 ? jt5Var.p : jq1Var;
        Boolean bool7 = (i & 65536) != 0 ? jt5Var.q : bool3;
        Boolean bool8 = (i & 131072) != 0 ? jt5Var.r : bool4;
        jt5Var.getClass();
        u26Var3.getClass();
        a36Var2.getClass();
        hi2Var2.getClass();
        nx5Var2.getClass();
        return new jt5(u26Var3, a36Var2, uuid2, hi2Var2, str4, z2, nx5Var2, u41Var2, videoRenderer2, bool5, num2, videoFiltering2, str5, str6, bool6, jq1Var2, bool7, bool8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt5)) {
            return false;
        }
        jt5 jt5Var = (jt5) obj;
        if (this.a == jt5Var.a && this.b == jt5Var.b && nb3.k(this.c, jt5Var.c) && nb3.k(this.d, jt5Var.d) && nb3.k(this.e, jt5Var.e) && this.f == jt5Var.f && this.g == jt5Var.g && nb3.k(this.h, jt5Var.h) && this.i == jt5Var.i && nb3.k(this.j, jt5Var.j) && nb3.k(this.k, jt5Var.k) && this.l == jt5Var.l && nb3.k(this.m, jt5Var.m) && nb3.k(this.n, jt5Var.n) && nb3.k(this.o, jt5Var.o) && this.p == jt5Var.p && nb3.k(this.q, jt5Var.q) && nb3.k(this.r, jt5Var.r)) {
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
        int hashCode13 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        UUID uuid = this.c;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int hashCode14 = (this.d.hashCode() + ((hashCode13 + hashCode) * 31)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode15 = (this.g.hashCode() + xg6.e((hashCode14 + hashCode2) * 31, this.f, 31)) * 31;
        u41 u41Var = this.h;
        if (u41Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = u41Var.hashCode();
        }
        int i2 = (hashCode15 + hashCode3) * 31;
        VideoRenderer videoRenderer = this.i;
        if (videoRenderer == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = videoRenderer.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        Boolean bool = this.j;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        Integer num = this.k;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        VideoFiltering videoFiltering = this.l;
        if (videoFiltering == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = videoFiltering.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        String str2 = this.m;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i7 = (i6 + hashCode8) * 31;
        String str3 = this.n;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        Boolean bool2 = this.o;
        if (bool2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool2.hashCode();
        }
        int i9 = (i8 + hashCode10) * 31;
        jq1 jq1Var = this.p;
        if (jq1Var == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = jq1Var.hashCode();
        }
        int i10 = (i9 + hashCode11) * 31;
        Boolean bool3 = this.q;
        if (bool3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode12) * 31;
        Boolean bool4 = this.r;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RomConfig(runtimeConsoleType=");
        sb.append(this.a);
        sb.append(", runtimeMicSource=");
        sb.append(this.b);
        sb.append(", layoutId=");
        sb.append(this.c);
        sb.append(", gbaSlotConfig=");
        sb.append(this.d);
        sb.append(", customName=");
        sb.append(this.e);
        sb.append(", useHgEngineFix=");
        sb.append(this.f);
        sb.append(", inputMode=");
        sb.append(this.g);
        sb.append(", customControllerConfiguration=");
        sb.append(this.h);
        sb.append(", videoRenderer=");
        sb.append(this.i);
        sb.append(", threadedRendering=");
        sb.append(this.j);
        sb.append(", internalResolutionScaling=");
        sb.append(this.k);
        sb.append(", videoFiltering=");
        sb.append(this.l);
        sb.append(", retroArchShaderPresetPath=");
        i61.B(sb, this.m, ", retroArchShaderParameters=", this.n, ", retroAchievementsEnabled=");
        sb.append(this.o);
        sb.append(", dualScreenPreset=");
        sb.append(this.p);
        sb.append(", dualScreenKeepAspectRatio=");
        sb.append(this.q);
        sb.append(", dualScreenIntegerScale=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }

    public jt5(u26 u26Var, a36 a36Var, UUID uuid, hi2 hi2Var, String str, boolean z, nx5 nx5Var, u41 u41Var, VideoRenderer videoRenderer, Boolean bool, Integer num, VideoFiltering videoFiltering, String str2, String str3, Boolean bool2, jq1 jq1Var, Boolean bool3, Boolean bool4) {
        u26Var.getClass();
        a36Var.getClass();
        hi2Var.getClass();
        nx5Var.getClass();
        this.a = u26Var;
        this.b = a36Var;
        this.c = uuid;
        this.d = hi2Var;
        this.e = str;
        this.f = z;
        this.g = nx5Var;
        this.h = u41Var;
        this.i = videoRenderer;
        this.j = bool;
        this.k = num;
        this.l = videoFiltering;
        this.m = str2;
        this.n = str3;
        this.o = bool2;
        this.p = jq1Var;
        this.q = bool3;
        this.r = bool4;
    }
}
