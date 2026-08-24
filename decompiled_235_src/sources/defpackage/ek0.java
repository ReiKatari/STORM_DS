package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek0  reason: default package */
/* loaded from: classes.dex */
public final class ek0 {
    public static final xx f;
    public final ArrayList a;
    public final go4 b;
    public final int c;
    public final List d;
    public final sy6 e;

    static {
        new xx("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        new xx("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        f = new xx("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public ek0(ArrayList arrayList, go4 go4Var, int i, ArrayList arrayList2, sy6 sy6Var) {
        this.a = arrayList;
        this.b = go4Var;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = sy6Var;
    }

    public final Range a() {
        Range range = (Range) this.b.b(f, yy.h);
        Objects.requireNonNull(range);
        return range;
    }
}
