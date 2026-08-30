package defpackage;

import android.app.DownloadManager;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i01  reason: default package */
/* loaded from: classes.dex */
public final class i01 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 2;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(hv1 hv1Var, ev1 ev1Var, String str, long j, jb4 jb4Var, lb4 lb4Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = hv1Var;
        this.d0 = ev1Var;
        this.e0 = str;
        this.Z = j;
        this.f0 = jb4Var;
        this.g0 = lb4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((i01) t((j11) obj2, (xw5) obj)).v(o27Var);
            case 1:
                return ((i01) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((i01) t((j11) obj2, (nu4) obj)).v(o27Var);
            default:
                return ((i01) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.e0;
        Object obj5 = this.d0;
        switch (i) {
            case 0:
                i01 i01Var = new i01((s37) obj5, (k01) obj4, (v50) obj3, this.Z, (c63) obj2, j11Var);
                i01Var.c0 = obj;
                return i01Var;
            case 1:
                return new i01((hv1) this.c0, (ev1) obj5, (String) obj4, this.Z, (jb4) obj3, (lb4) obj2, j11Var);
            case 2:
                i01 i01Var2 = new i01(this.Z, (cm2) obj5, (DownloadManager) obj4, (us) obj3, (File) obj2, j11Var);
                i01Var2.c0 = obj;
                return i01Var2;
            default:
                return new i01((vo4) this.c0, (String) obj5, this.Z, (vr6) obj4, (bq6) obj3, (pb4) obj2, j11Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i01.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(long j, cm2 cm2Var, DownloadManager downloadManager, us usVar, File file, j11 j11Var) {
        super(2, j11Var);
        this.Z = j;
        this.d0 = cm2Var;
        this.e0 = downloadManager;
        this.f0 = usVar;
        this.g0 = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(vo4 vo4Var, String str, long j, vr6 vr6Var, bq6 bq6Var, pb4 pb4Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = vo4Var;
        this.d0 = str;
        this.Z = j;
        this.e0 = vr6Var;
        this.f0 = bq6Var;
        this.g0 = pb4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(s37 s37Var, k01 k01Var, v50 v50Var, long j, c63 c63Var, j11 j11Var) {
        super(2, j11Var);
        this.d0 = s37Var;
        this.e0 = k01Var;
        this.f0 = v50Var;
        this.Z = j;
        this.g0 = c63Var;
    }
}
