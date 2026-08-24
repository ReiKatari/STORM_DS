package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.b;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a84  reason: default package */
/* loaded from: classes.dex */
public final class a84 implements View.OnClickListener {
    public final b84 A;
    public final int B;
    public final int L;

    public a84(Context context, b84 b84Var, XmlResourceParser xmlResourceParser) {
        this.B = -1;
        this.L = 17;
        this.A = b84Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.B = obtainStyledAttributes.getResourceId(index, this.B);
            } else if (index == 0) {
                this.L = obtainStyledAttributes.getInt(index, this.L);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
    public final void a(MotionLayout motionLayout, int i, b84 b84Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.B;
        MotionLayout motionLayout2 = motionLayout;
        if (i2 != -1) {
            motionLayout2 = motionLayout.findViewById(i2);
        }
        if (motionLayout2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = b84Var.d;
        int i4 = b84Var.c;
        if (i3 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i5 = this.L;
        int i6 = i5 & 1;
        boolean z5 = false;
        if (i6 != 0 && i == i3) {
            z = true;
        } else {
            z = false;
        }
        if ((i5 & 256) != 0 && i == i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i6 != 0 && i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z3 | z6;
        if ((i5 & 16) != 0 && i == i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z7 | z4;
        if ((i5 & 4096) != 0 && i == i4) {
            z5 = true;
        }
        if (z8 | z5) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i = this.B;
        if (i == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i);
        if (findViewById == null) {
            Log.e("MotionScene", " (*)  could not find id " + i);
            return;
        }
        findViewById.setOnClickListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        b84 b84Var = this.A;
        b bVar = b84Var.j;
        MotionLayout motionLayout = bVar.a;
        if (motionLayout.y0) {
            if (b84Var.d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.z(b84Var.c);
                    return;
                }
                b84 b84Var2 = new b84(bVar, b84Var);
                b84Var2.d = currentState;
                b84Var2.c = b84Var.c;
                motionLayout.setTransition(b84Var2);
                motionLayout.p(1.0f);
                motionLayout.k1 = null;
                return;
            }
            b84 b84Var3 = bVar.c;
            int i = this.L;
            int i2 = i & 1;
            boolean z2 = false;
            boolean z3 = true;
            if (i2 == 0 && (i & 256) == 0) {
                z = false;
            } else {
                z = true;
            }
            int i3 = i & 16;
            if (i3 == 0 && (i & 4096) == 0) {
                z3 = false;
            }
            if (z && z3) {
                if (b84Var3 != b84Var) {
                    motionLayout.setTransition(b84Var);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z3 = false;
                }
                if (b84Var != b84Var3) {
                    int i4 = b84Var.c;
                    int i5 = b84Var.d;
                    int i6 = motionLayout.u0;
                    if (i5 == -1) {
                        if (i6 == i4) {
                            return;
                        }
                    } else if (i6 != i5 && i6 != i4) {
                        return;
                    }
                }
                if (!z2 && i2 != 0) {
                    motionLayout.setTransition(b84Var);
                    motionLayout.p(1.0f);
                    motionLayout.k1 = null;
                    return;
                } else if (!z3 && i3 != 0) {
                    motionLayout.setTransition(b84Var);
                    motionLayout.p(RecyclerView.B1);
                    return;
                } else if (!z2 && (i & 256) != 0) {
                    motionLayout.setTransition(b84Var);
                    motionLayout.setProgress(1.0f);
                    return;
                } else if (!z3 && (i & 4096) != 0) {
                    motionLayout.setTransition(b84Var);
                    motionLayout.setProgress(RecyclerView.B1);
                    return;
                }
            }
            z2 = z;
            if (b84Var != b84Var3) {
            }
            if (!z2) {
            }
            if (!z3) {
            }
            if (!z2) {
            }
            if (!z3) {
            }
        }
    }
}
