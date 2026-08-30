package oj;

import java.io.InputStream;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final Object f11052e;

    public a(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.f11052e = inputStream;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[" + this.f11052e.toString() + "]";
    }
}
