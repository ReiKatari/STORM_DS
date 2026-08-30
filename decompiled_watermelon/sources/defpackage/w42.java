package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w42  reason: default package */
/* loaded from: classes.dex */
public final class w42 extends bn6 {
    public final /* synthetic */ or5 e;
    public final /* synthetic */ za f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(String str, or5 or5Var, za zaVar) {
        super(str);
        this.e = or5Var;
        this.f = zaVar;
    }

    @Override // defpackage.bn6
    public final long a() {
        nr5 nr5Var;
        or5 or5Var = this.e;
        try {
            nr5Var = or5Var.g();
        } catch (Throwable th) {
            nr5Var = new nr5(or5Var, th, 2);
        }
        za zaVar = this.f;
        if (((CopyOnWriteArrayList) zaVar.R).contains(or5Var)) {
            ((LinkedBlockingDeque) zaVar.X).put(nr5Var);
            return -1L;
        }
        return -1L;
    }
}
