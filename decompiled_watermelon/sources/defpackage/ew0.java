package defpackage;

import androidx.preference.Preference;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ew0  reason: default package */
/* loaded from: classes.dex */
public final class ew0 {
    public final ExecutorService a = pu.j(false);
    public final bb1 b = tg1.a;
    public final ExecutorService c = pu.j(true);
    public final hm1 d = new Object();
    public final ji7 e;
    public final sn1 f;
    public final t71 g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final y60 m;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hm1] */
    public ew0(bq0 bq0Var) {
        ji7 ji7Var = (qr2) bq0Var.B;
        this.e = ji7Var == null ? ec1.a : ji7Var;
        this.f = sn1.i0;
        this.g = new t71(4);
        this.h = 4;
        this.i = Preference.DEFAULT_ORDER;
        this.k = 20;
        this.j = 8;
        this.l = true;
        this.m = new y60(27);
    }
}
