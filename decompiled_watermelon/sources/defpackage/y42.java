package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y42  reason: default package */
/* loaded from: classes.dex */
public final class y42 extends ws5 {
    public final HashMap X = new HashMap();

    @Override // defpackage.ws5
    public final ts5 b(Object obj) {
        return (ts5) this.X.get(obj);
    }

    @Override // defpackage.ws5
    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.X.remove(obj);
        return c;
    }
}
