package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf6  reason: default package */
/* loaded from: classes.dex */
public final class vf6 extends IOException {
    public final l12 A;

    public vf6(l12 l12Var) {
        super("stream was reset: " + l12Var);
        this.A = l12Var;
    }
}
