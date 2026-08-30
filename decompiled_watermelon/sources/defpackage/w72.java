package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w72  reason: default package */
/* loaded from: classes.dex */
public final class w72 implements b06 {
    public final b06 a;
    public final boolean b;
    public final mi2 c;

    public w72(b06 b06Var, boolean z, mi2 mi2Var) {
        this.a = b06Var;
        this.b = z;
        this.c = mi2Var;
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        return new v72(this);
    }
}
