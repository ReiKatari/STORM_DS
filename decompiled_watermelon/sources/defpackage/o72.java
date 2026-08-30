package defpackage;

import java.io.File;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o72  reason: default package */
/* loaded from: classes.dex */
public final class o72 implements b06 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public o72(File file, p72 p72Var) {
        file.getClass();
        p72Var.getClass();
        this.b = file;
        this.c = p72Var;
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new m72(this);
            default:
                return new ll2(this);
        }
    }

    public o72(ki2 ki2Var, mi2 mi2Var) {
        this.b = ki2Var;
        this.c = mi2Var;
    }
}
