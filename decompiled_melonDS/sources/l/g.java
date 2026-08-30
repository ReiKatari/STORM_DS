package l;

import a6.q0;
import a6.x0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import q.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends d.m implements DialogInterface, j {
    public x X;
    public final y Y;
    public final f Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = h(r5, r6)
            r0 = 1
            r1 = 2130969006(0x7f0401ae, float:1.7546682E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            l.y r2 = new l.y
            r2.<init>()
            r4.Y = r2
            l.m r2 = r4.f()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            l.x r5 = (l.x) r5
            r5.N0 = r6
            r2.f()
            l.f r5 = new l.f
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.Z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        x xVar = (x) f();
        xVar.w();
        ((ViewGroup) xVar.f8482u0.findViewById(16908290)).addView(view, layoutParams);
        xVar.f8469g0.a(xVar.f8468f0.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return k7.w.j(this.Y, getWindow().getDecorView(), this, keyEvent);
    }

    public final m f() {
        if (this.X == null) {
            k7.a0 a0Var = m.A;
            this.X = new x(getContext(), getWindow(), this, this);
        }
        return this.X;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) {
        x xVar = (x) f();
        xVar.w();
        return xVar.f8468f0.findViewById(i2);
    }

    public final void g(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().f();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().m(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().b();
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i2;
        boolean z13;
        ListAdapter listAdapter;
        int i10;
        int i11;
        View findViewById;
        View findViewById2;
        g(bundle);
        f fVar = this.Z;
        fVar.f8389b.setContentView(fVar.A);
        Context context = fVar.f8388a;
        Window window = fVar.f8390c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = fVar.f8394g;
        int i12 = 0;
        if (view == null) {
            if (fVar.f8395h != 0) {
                view = LayoutInflater.from(context).inflate(fVar.f8395h, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !f.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.f8396i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.f8393f != null) {
                ((LinearLayout.LayoutParams) ((v1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b10 = f.b(findViewById7, findViewById4);
        ViewGroup b11 = f.b(findViewById8, findViewById5);
        ViewGroup b12 = f.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.f8405s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f8405s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b11.findViewById(16908299);
        fVar.f8409w = textView;
        if (textView != null) {
            CharSequence charSequence = fVar.f8392e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                fVar.f8405s.removeView(fVar.f8409w);
                if (fVar.f8393f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) fVar.f8405s.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(fVar.f8405s);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(fVar.f8393f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b11.setVisibility(8);
                }
            }
        }
        Button button = (Button) b12.findViewById(16908313);
        fVar.f8397j = button;
        com.google.android.material.datepicker.l lVar = fVar.H;
        button.setOnClickListener(lVar);
        boolean isEmpty = TextUtils.isEmpty(fVar.f8398k);
        Button button2 = fVar.f8397j;
        if (isEmpty) {
            button2.setVisibility(8);
            z11 = false;
        } else {
            button2.setText(fVar.f8398k);
            fVar.f8397j.setVisibility(0);
            z11 = true;
        }
        Button button3 = (Button) b12.findViewById(16908314);
        fVar.m = button3;
        button3.setOnClickListener(lVar);
        boolean isEmpty2 = TextUtils.isEmpty(fVar.f8400n);
        Button button4 = fVar.m;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(fVar.f8400n);
            fVar.m.setVisibility(0);
            z11 |= true;
        }
        Button button5 = (Button) b12.findViewById(16908315);
        fVar.f8402p = button5;
        button5.setOnClickListener(lVar);
        boolean isEmpty3 = TextUtils.isEmpty(fVar.f8403q);
        Button button6 = fVar.f8402p;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(fVar.f8403q);
            fVar.f8402p.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z11) {
                Button button7 = fVar.f8397j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (z11) {
                Button button8 = fVar.m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (z11) {
                Button button9 = fVar.f8402p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (!z11) {
            b12.setVisibility(8);
        }
        if (fVar.f8410x != null) {
            b10.addView(fVar.f8410x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            fVar.f8407u = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(fVar.f8391d) && fVar.F) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                fVar.f8408v = textView2;
                textView2.setText(fVar.f8391d);
                Drawable drawable = fVar.f8406t;
                if (drawable != null) {
                    fVar.f8407u.setImageDrawable(drawable);
                } else {
                    fVar.f8408v.setPadding(fVar.f8407u.getPaddingLeft(), fVar.f8407u.getPaddingTop(), fVar.f8407u.getPaddingRight(), fVar.f8407u.getPaddingBottom());
                    fVar.f8407u.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                fVar.f8407u.setVisibility(8);
                b10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (b10 != null && b10.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (b12.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && (findViewById2 = b11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = fVar.f8405s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (fVar.f8392e == null && fVar.f8393f == null) {
                findViewById = null;
            } else {
                findViewById = b10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = b11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.f8393f;
        if (alertController$RecycleListView != null && (!z13 || i2 == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i2 != 0) {
                i10 = alertController$RecycleListView.getPaddingTop();
            } else {
                i10 = alertController$RecycleListView.A;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z13) {
                i11 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i11 = alertController$RecycleListView.B;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i10, paddingRight, i11);
        }
        if (!z12) {
            View view2 = fVar.f8393f;
            if (view2 == null) {
                view2 = fVar.f8405s;
            }
            if (view2 != null) {
                if (z13) {
                    i12 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = x0.f533a;
                q0.b(view2, i2 | i12, 3);
                if (findViewById11 != null) {
                    b11.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b11.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = fVar.f8393f;
        if (alertController$RecycleListView2 != null && (listAdapter = fVar.f8411y) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i13 = fVar.f8412z;
            if (i13 > -1) {
                alertController$RecycleListView2.setItemChecked(i13, true);
                alertController$RecycleListView2.setSelection(i13);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Z.f8405s;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Z.f8405s;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // d.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        x xVar = (x) f();
        xVar.A();
        aj.g gVar = xVar.f8471i0;
        if (gVar != null) {
            gVar.m0(false);
        }
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(int i2) {
        e();
        f().j(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        f().m(getContext().getString(i2));
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(View view) {
        e();
        f().k(view);
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        f().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        f fVar = this.Z;
        fVar.f8391d = charSequence;
        TextView textView = fVar.f8408v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
