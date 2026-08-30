package a6;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f509a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f510b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f511c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f512d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f513e;

    public r(ViewGroup viewGroup) {
        this.f511c = viewGroup;
    }

    public final boolean a(float f8, float f10, boolean z10) {
        ViewParent e6;
        if (this.f512d && (e6 = e(0)) != null) {
            try {
                return e6.onNestedFling(this.f511c, f8, f10, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f8, float f10) {
        ViewParent e6;
        if (this.f512d && (e6 = e(0)) != null) {
            try {
                return e6.onNestedPreFling(this.f511c, f8, f10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i2, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent e6;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f512d || (e6 = e(i11)) == null) {
            return false;
        }
        if (i2 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f511c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f513e == null) {
                this.f513e = new int[2];
            }
            iArr3 = this.f513e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e6 instanceof s) {
            ((s) e6).c(viewGroup, i2, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e6.onNestedPreScroll(viewGroup, i2, i10, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i2, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e6;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f512d && (e6 = e(i13)) != null) {
            if (i2 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f511c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f513e == null) {
                        this.f513e = new int[2];
                    }
                    int[] iArr4 = this.f513e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e6 instanceof t) {
                    ((t) e6).d(viewGroup, i2, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (e6 instanceof s) {
                        ((s) e6).e(viewGroup, i2, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            e6.onNestedScroll(viewGroup, i2, i10, i11, i12);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.f510b;
        }
        return this.f509a;
    }

    public final boolean f(int i2) {
        if (e(i2) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i2, int i10) {
        boolean onStartNestedScroll;
        if (!f(i10)) {
            if (this.f512d) {
                View view = this.f511c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof s;
                    if (z10) {
                        onStartNestedScroll = ((s) parent).f(view2, view, i2, i10);
                    } else {
                        if (i10 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i2);
                            } catch (AbstractMethodError e6) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                this.f510b = parent;
                            }
                        } else {
                            this.f509a = parent;
                        }
                        if (z10) {
                            ((s) parent).a(view2, view, i2, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i2);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i2) {
        ViewParent e6 = e(i2);
        if (e6 != null) {
            boolean z10 = e6 instanceof s;
            ViewGroup viewGroup = this.f511c;
            if (z10) {
                ((s) e6).b(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    e6.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    this.f510b = null;
                    return;
                }
                return;
            }
            this.f509a = null;
        }
    }
}
