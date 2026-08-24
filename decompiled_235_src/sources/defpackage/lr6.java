package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr6  reason: default package */
/* loaded from: classes.dex */
public final class lr6 extends IOException {
    public final a62 A;

    public lr6(a62 a62Var) {
        super("stream was reset: " + a62Var);
        this.A = a62Var;
    }
}
