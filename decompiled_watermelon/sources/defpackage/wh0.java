package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wh0  reason: default package */
/* loaded from: classes.dex */
public final class wh0 {
    public static final uw f;
    public final ArrayList a;
    public final ef4 b;
    public final int c;
    public final List d;
    public final im6 e;

    static {
        new uw("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        new uw("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        f = new uw("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public wh0(ArrayList arrayList, ef4 ef4Var, int i, ArrayList arrayList2, im6 im6Var) {
        this.a = arrayList;
        this.b = ef4Var;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = im6Var;
    }

    public final Range a() {
        Range range = (Range) this.b.d(f, jx.h);
        Objects.requireNonNull(range);
        return range;
    }
}
