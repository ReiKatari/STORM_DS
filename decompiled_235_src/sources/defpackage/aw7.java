package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw7  reason: default package */
/* loaded from: classes.dex */
public final class aw7 {
    public static final String i = ga0.h("WorkContinuationImpl");
    public final lw7 a;
    public final String b;
    public final y72 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public xd5 h;

    public aw7(lw7 lw7Var, String str, y72 y72Var, List list) {
        this.a = lw7Var;
        this.b = str;
        this.c = y72Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (y72Var == y72.REPLACE && ((gm4) list.get(i2)).b.u != Long.MAX_VALUE) {
                i.h("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((gm4) list.get(i2)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(aw7 aw7Var) {
        HashSet hashSet = new HashSet();
        aw7Var.getClass();
        return hashSet;
    }

    public final xd5 a() {
        if (!this.g) {
            lw7 lw7Var = this.a;
            xd5 xd5Var = lw7Var.b.m;
            this.h = uj2.a0(xd5Var, "EnqueueRunnable_" + this.c.name(), lw7Var.d.a, new t46(this, 24));
        } else {
            ga0 f = ga0.f();
            f.j(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.h;
    }
}
