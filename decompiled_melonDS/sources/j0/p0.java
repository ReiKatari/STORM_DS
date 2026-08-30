package j0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: h  reason: collision with root package name */
    public static final g f7271h = new g("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* renamed from: i  reason: collision with root package name */
    public static final g f7272i = new g("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* renamed from: j  reason: collision with root package name */
    public static final g f7273j = new g("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7274a;

    /* renamed from: b  reason: collision with root package name */
    public final i1 f7275b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7276c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7277d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7278e;

    /* renamed from: f  reason: collision with root package name */
    public final h2 f7279f;

    /* renamed from: g  reason: collision with root package name */
    public final u f7280g;

    public p0(ArrayList arrayList, i1 i1Var, int i2, ArrayList arrayList2, boolean z10, h2 h2Var, u uVar) {
        this.f7274a = arrayList;
        this.f7275b = i1Var;
        this.f7276c = i2;
        this.f7277d = Collections.unmodifiableList(arrayList2);
        this.f7278e = z10;
        this.f7279f = h2Var;
        this.f7280g = uVar;
    }

    public final Range a() {
        Range range = (Range) this.f7275b.h(f7273j, k.f7234h);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Integer num = (Integer) this.f7275b.h(l2.O, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.f7275b.h(l2.P, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
