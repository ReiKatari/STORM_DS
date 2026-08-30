package m0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public l(m mVar, int i2, ta.a aVar) {
        this.R = mVar;
        this.B = i2;
        this.L = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5.i iVar;
        ArrayList arrayList;
        int decrementAndGet;
        switch (this.A) {
            case 0:
                m mVar = (m) this.R;
                int i2 = this.B;
                ta.a aVar = (ta.a) this.L;
                boolean z10 = mVar.L;
                AtomicInteger atomicInteger = mVar.R;
                ArrayList arrayList2 = mVar.B;
                if (!mVar.isDone() && arrayList2 != null) {
                    boolean z11 = true;
                    try {
                        try {
                            try {
                                try {
                                    p7.m.o("Tried to set value from future which is not done", aVar.isDone());
                                    arrayList2.set(i2, i.b(aVar));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    if (decrementAndGet < 0) {
                                        z11 = false;
                                    }
                                    p7.m.o("Less than 0 remaining futures", z11);
                                } catch (ExecutionException e6) {
                                    if (z10) {
                                        mVar.Y.c(e6.getCause());
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    if (decrementAndGet2 < 0) {
                                        z11 = false;
                                    }
                                    p7.m.o("Less than 0 remaining futures", z11);
                                    if (decrementAndGet2 == 0) {
                                        ArrayList arrayList3 = mVar.B;
                                        if (arrayList3 != null) {
                                            iVar = mVar.Y;
                                            arrayList = new ArrayList(arrayList3);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } catch (RuntimeException e10) {
                                if (z10) {
                                    mVar.Y.c(e10);
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                if (decrementAndGet3 < 0) {
                                    z11 = false;
                                }
                                p7.m.o("Less than 0 remaining futures", z11);
                                if (decrementAndGet3 == 0) {
                                    ArrayList arrayList4 = mVar.B;
                                    if (arrayList4 != null) {
                                        iVar = mVar.Y;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Error e11) {
                            mVar.Y.c(e11);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            if (decrementAndGet4 < 0) {
                                z11 = false;
                            }
                            p7.m.o("Less than 0 remaining futures", z11);
                            if (decrementAndGet4 == 0) {
                                ArrayList arrayList5 = mVar.B;
                                if (arrayList5 != null) {
                                    iVar = mVar.Y;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            } else {
                                return;
                            }
                        } catch (CancellationException unused) {
                            if (z10) {
                                mVar.cancel(false);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            if (decrementAndGet5 < 0) {
                                z11 = false;
                            }
                            p7.m.o("Less than 0 remaining futures", z11);
                            if (decrementAndGet5 == 0) {
                                ArrayList arrayList6 = mVar.B;
                                if (arrayList6 != null) {
                                    iVar = mVar.Y;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } else {
                                return;
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = mVar.B;
                            if (arrayList7 != null) {
                                iVar = mVar.Y;
                                arrayList = new ArrayList(arrayList7);
                                iVar.b(arrayList);
                                return;
                            }
                            p7.m.o(null, mVar.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        if (decrementAndGet6 < 0) {
                            z11 = false;
                        }
                        p7.m.o("Less than 0 remaining futures", z11);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = mVar.B;
                            if (arrayList8 != null) {
                                mVar.Y.b(new ArrayList(arrayList8));
                            } else {
                                p7.m.o(null, mVar.isDone());
                            }
                        }
                        throw th2;
                    }
                }
                p7.m.o("Future was done before all dependencies completed", z10);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((TextView) this.L).setTypeface((Typeface) this.R, this.B);
                return;
            default:
                ((BottomSheetBehavior) this.R).E((View) this.L, this.B, false);
                return;
        }
    }

    public l(TextView textView, Typeface typeface, int i2) {
        this.L = textView;
        this.R = typeface;
        this.B = i2;
    }

    public l(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.R = bottomSheetBehavior;
        this.L = view;
        this.B = i2;
    }
}
