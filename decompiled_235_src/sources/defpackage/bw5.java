package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.UUID;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw5  reason: default package */
/* loaded from: classes.dex */
public final class bw5 {
    public final Context a;
    public final wa3 b;

    public bw5(Context context, wa3 wa3Var) {
        this.a = context;
        this.b = wa3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jt5 jt5Var, ConsoleType consoleType, MicSource micSource, VideoRenderer videoRenderer, boolean z, int i, VideoFiltering videoFiltering, String str, String str2, boolean z2, boolean z3, s41 s41Var) {
        aw5 aw5Var;
        int i2;
        String str3;
        UUID uuid;
        ConsoleType consoleType2;
        jt5 jt5Var2;
        boolean z4;
        boolean z5;
        VideoRenderer videoRenderer2;
        VideoFiltering videoFiltering2;
        int i3;
        String str4;
        String str5;
        a36 a36Var;
        u26 u26Var;
        MicSource micSource2;
        boolean z6;
        String str6;
        ConsoleType consoleType3;
        VideoFiltering videoFiltering3;
        int i4;
        boolean z7;
        String str7;
        String str8;
        MicSource micSource3;
        boolean z8;
        u26 u26Var2;
        a36 a36Var2;
        UUID uuid2;
        Object obj;
        VideoRenderer videoRenderer3;
        boolean z9;
        hi2 hi2Var;
        bx5 bx5Var;
        String str9;
        String str10;
        bx5 bx5Var2;
        fk3 fk3Var;
        String str11;
        if (s41Var instanceof aw5) {
            aw5Var = (aw5) s41Var;
            int i5 = aw5Var.p0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aw5Var.p0 = i5 - Integer.MIN_VALUE;
                Object obj2 = aw5Var.n0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = aw5Var.p0;
                wa3 wa3Var = this.b;
                if (i2 == 0) {
                    if (i2 == 1) {
                        boolean z10 = aw5Var.l0;
                        z8 = aw5Var.k0;
                        i4 = aw5Var.m0;
                        z7 = aw5Var.j0;
                        UUID uuid3 = aw5Var.i0;
                        micSource3 = aw5Var.h0;
                        a36 a36Var3 = aw5Var.g0;
                        consoleType3 = aw5Var.f0;
                        u26 u26Var3 = aw5Var.e0;
                        str8 = aw5Var.d0;
                        str7 = aw5Var.Z;
                        str3 = null;
                        videoFiltering3 = aw5Var.Y;
                        videoRenderer3 = aw5Var.X;
                        jt5Var2 = aw5Var.R;
                        oi2.Y(obj2);
                        u26Var2 = u26Var3;
                        a36Var2 = a36Var3;
                        uuid2 = uuid3;
                        obj = obj2;
                        z9 = z10;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    str3 = null;
                    oi2.Y(obj2);
                    u26 u26Var4 = jt5Var.a;
                    a36 a36Var4 = jt5Var.b;
                    UUID uuid4 = jt5Var.c;
                    if (uuid4 != null) {
                        aw5Var.R = jt5Var;
                        aw5Var.X = videoRenderer;
                        aw5Var.Y = videoFiltering;
                        aw5Var.Z = str;
                        aw5Var.d0 = str2;
                        aw5Var.e0 = u26Var4;
                        consoleType3 = consoleType;
                        aw5Var.f0 = consoleType3;
                        aw5Var.g0 = a36Var4;
                        aw5Var.h0 = micSource;
                        aw5Var.i0 = uuid4;
                        aw5Var.j0 = z;
                        aw5Var.m0 = i;
                        aw5Var.k0 = z2;
                        aw5Var.l0 = z3;
                        aw5Var.p0 = 1;
                        Object d = wa3Var.d(uuid4, aw5Var);
                        if (d == x61Var) {
                            return x61Var;
                        }
                        videoFiltering3 = videoFiltering;
                        i4 = i;
                        z7 = z;
                        str7 = str;
                        str8 = str2;
                        micSource3 = micSource;
                        jt5Var2 = jt5Var;
                        z8 = z2;
                        u26Var2 = u26Var4;
                        a36Var2 = a36Var4;
                        uuid2 = uuid4;
                        obj = d;
                        videoRenderer3 = videoRenderer;
                        z9 = z3;
                    } else {
                        uuid = uuid4;
                        consoleType2 = consoleType;
                        jt5Var2 = jt5Var;
                        z4 = z2;
                        z5 = z3;
                        videoRenderer2 = videoRenderer;
                        videoFiltering2 = videoFiltering;
                        i3 = i;
                        str4 = str;
                        str5 = str2;
                        a36Var = a36Var4;
                        u26Var = u26Var4;
                        micSource2 = micSource;
                        z6 = z;
                        str6 = null;
                        String str12 = ((fk3) wa3Var.g.getValue()).b;
                        hi2Var = jt5Var2.d;
                        if (hi2Var instanceof uw5) {
                            String str13 = str3;
                            bx5Var = new bx5(ax5.None, str13, str13);
                        } else if (hi2Var instanceof sw5) {
                            ax5 ax5Var = ax5.GbaRom;
                            sw5 sw5Var = (sw5) hi2Var;
                            Uri uri = sw5Var.o;
                            Context context = this.a;
                            if (uri != null) {
                                str9 = zl1.g(context, uri).i();
                            } else {
                                str9 = null;
                            }
                            Uri uri2 = sw5Var.p;
                            if (uri2 != null) {
                                str10 = zl1.g(context, uri2).i();
                            } else {
                                str10 = null;
                            }
                            bx5Var2 = new bx5(ax5Var, str9, str10);
                            return new zt5(u26Var, consoleType2, a36Var, micSource2, uuid, str6, str12, bx5Var2, jt5Var2.e, jt5Var2.f, jt5Var2.g, jt5Var2.i, videoRenderer2, jt5Var2.j, z6, jt5Var2.k, i3, jt5Var2.l, videoFiltering2, jt5Var2.m, str4, jt5Var2.n, str5, z4, jt5Var2.o, z5, jt5Var2.p, jt5Var2.q, jt5Var2.r);
                        } else if (nb3.k(hi2Var, vw5.o)) {
                            bx5Var = new bx5(ax5.RumblePak, null, null);
                        } else if (nb3.k(hi2Var, tw5.o)) {
                            bx5Var = new bx5(ax5.MemoryExpansion, null, null);
                        } else if (nb3.k(hi2Var, rw5.o)) {
                            bx5Var = new bx5(ax5.AnalogInput, null, null);
                        } else {
                            i.d();
                            return null;
                        }
                        bx5Var2 = bx5Var;
                        return new zt5(u26Var, consoleType2, a36Var, micSource2, uuid, str6, str12, bx5Var2, jt5Var2.e, jt5Var2.f, jt5Var2.g, jt5Var2.i, videoRenderer2, jt5Var2.j, z6, jt5Var2.k, i3, jt5Var2.l, videoFiltering2, jt5Var2.m, str4, jt5Var2.n, str5, z4, jt5Var2.o, z5, jt5Var2.p, jt5Var2.q, jt5Var2.r);
                    }
                }
                fk3Var = (fk3) obj;
                if (fk3Var == null) {
                    str11 = fk3Var.b;
                } else {
                    str11 = str3;
                }
                a36 a36Var5 = a36Var2;
                str6 = str11;
                consoleType2 = consoleType3;
                uuid = uuid2;
                micSource2 = micSource3;
                a36Var = a36Var5;
                videoRenderer2 = videoRenderer3;
                z5 = z9;
                z4 = z8;
                i3 = i4;
                z6 = z7;
                videoFiltering2 = videoFiltering3;
                str5 = str8;
                str4 = str7;
                u26Var = u26Var2;
                String str122 = ((fk3) wa3Var.g.getValue()).b;
                hi2Var = jt5Var2.d;
                if (hi2Var instanceof uw5) {
                }
                bx5Var2 = bx5Var;
                return new zt5(u26Var, consoleType2, a36Var, micSource2, uuid, str6, str122, bx5Var2, jt5Var2.e, jt5Var2.f, jt5Var2.g, jt5Var2.i, videoRenderer2, jt5Var2.j, z6, jt5Var2.k, i3, jt5Var2.l, videoFiltering2, jt5Var2.m, str4, jt5Var2.n, str5, z4, jt5Var2.o, z5, jt5Var2.p, jt5Var2.q, jt5Var2.r);
            }
        }
        aw5Var = new aw5(this, s41Var);
        Object obj22 = aw5Var.n0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = aw5Var.p0;
        wa3 wa3Var2 = this.b;
        if (i2 == 0) {
        }
        fk3Var = (fk3) obj;
        if (fk3Var == null) {
        }
        a36 a36Var52 = a36Var2;
        str6 = str11;
        consoleType2 = consoleType3;
        uuid = uuid2;
        micSource2 = micSource3;
        a36Var = a36Var52;
        videoRenderer2 = videoRenderer3;
        z5 = z9;
        z4 = z8;
        i3 = i4;
        z6 = z7;
        videoFiltering2 = videoFiltering3;
        str5 = str8;
        str4 = str7;
        u26Var = u26Var2;
        String str1222 = ((fk3) wa3Var2.g.getValue()).b;
        hi2Var = jt5Var2.d;
        if (hi2Var instanceof uw5) {
        }
        bx5Var2 = bx5Var;
        return new zt5(u26Var, consoleType2, a36Var, micSource2, uuid, str6, str1222, bx5Var2, jt5Var2.e, jt5Var2.f, jt5Var2.g, jt5Var2.i, videoRenderer2, jt5Var2.j, z6, jt5Var2.k, i3, jt5Var2.l, videoFiltering2, jt5Var2.m, str4, jt5Var2.n, str5, z4, jt5Var2.o, z5, jt5Var2.p, jt5Var2.q, jt5Var2.r);
    }
}
