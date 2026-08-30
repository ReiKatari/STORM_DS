package p8;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11503a;

    /* renamed from: b  reason: collision with root package name */
    public final WorkerParameters f11504b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f11505c = new AtomicInteger(-256);

    /* renamed from: d  reason: collision with root package name */
    public boolean f11506d;

    public u(Context context, WorkerParameters workerParameters) {
        this.f11503a = context;
        this.f11504b = workerParameters;
    }

    public abstract b5.l a();

    public abstract b5.l b();
}
