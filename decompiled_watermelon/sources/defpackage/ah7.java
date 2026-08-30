package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah7  reason: default package */
/* loaded from: classes.dex */
public final class ah7 {
    public static final String i = y70.h("WorkContinuationImpl");
    public final kh7 a;
    public final String b;
    public final g32 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public iq0 h;

    public ah7(kh7 kh7Var, String str, g32 g32Var, List list) {
        this.a = kh7Var;
        this.b = str;
        this.c = g32Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (g32Var == g32.REPLACE && ((id4) list.get(i2)).b.u != Long.MAX_VALUE) {
                i.i("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((id4) list.get(i2)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(ah7 ah7Var) {
        HashSet hashSet = new HashSet();
        ah7Var.getClass();
        return hashSet;
    }

    public final iq0 a() {
        if (!this.g) {
            kh7 kh7Var = this.a;
            y60 y60Var = kh7Var.b.m;
            this.h = yf2.G(y60Var, "EnqueueRunnable_" + this.c.name(), kh7Var.d.a, new t06(16, this));
        } else {
            y70 f = y70.f();
            f.j(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.h;
    }
}
