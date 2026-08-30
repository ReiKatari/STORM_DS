package me.magnum.melonds.ui.settings.preferences;

import a6.a1;
import ah.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import androidx.preference.i0;
import bk.a;
import d1.x1;
import fc.b;
import jc.f;
import jc.h;
import k7.w;
import l.d;
import l.g;
import me.magnum.melonds.R;
import nc.k;
import oe.o;
import uc.i;
import yb.j;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class FirmwareColourPickerPreference extends Preference {
    public static final Object B = v.F(new j(o.GRAY, 6390426), new j(o.BROWN, 12208384), new j(o.RED, 16449560), new j(o.PINK, 16485115), new j(o.ORANGE, 16486912), new j(o.YELLOW, 15983360), new j(o.LIME, 11205376), new j(o.GREEN, 64256), new j(o.DARK_GREEN, 41528), new j(o.TURQUOISE, 4840330), new j(o.LIGHT_BLUE, 3193587), new j(o.BLUE, 23027), new j(o.DARK_BLUE, 146), new j(o.PURPLE, 9044179), new j(o.VIOLET, 13828331), new j(o.FUCHSIA, 16449682));
    public View A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareColourPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_firmware_colour_picker_colour);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final void e(int i2) {
        Integer num = (Integer) B.get((o) ((b) o.getEntries()).get(i2));
        if (num != null) {
            long intValue = 4278190080L | num.intValue();
            View view = this.A;
            if (view != null) {
                view.setBackgroundColor((int) intValue);
            } else {
                k.f("viewSelectedColour");
                throw null;
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        i0Var.getClass();
        super.onBindViewHolder(i0Var);
        View q10 = i0Var.q(R.id.viewSelectedColour);
        q10.getClass();
        this.A = q10;
        e(getPersistedInt(0));
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_colour_picker, (ViewGroup) null, false);
        int i2 = R.id.layoutColourRow0;
        if (((LinearLayout) w.k(inflate, R.id.layoutColourRow0)) != null) {
            i2 = R.id.layoutColourRow1;
            if (((LinearLayout) w.k(inflate, R.id.layoutColourRow1)) != null) {
                i2 = R.id.layoutColourRow2;
                if (((LinearLayout) w.k(inflate, R.id.layoutColourRow2)) != null) {
                    i2 = R.id.layoutColourRow3;
                    if (((LinearLayout) w.k(inflate, R.id.layoutColourRow3)) != null) {
                        i2 = R.id.layoutGridColours;
                        ConstraintLayout constraintLayout = (ConstraintLayout) w.k(inflate, R.id.layoutGridColours);
                        if (constraintLayout != null) {
                            i2 = R.id.viewColour00;
                            if (w.k(inflate, R.id.viewColour00) != null) {
                                i2 = R.id.viewColour01;
                                if (w.k(inflate, R.id.viewColour01) != null) {
                                    i2 = R.id.viewColour02;
                                    if (w.k(inflate, R.id.viewColour02) != null) {
                                        i2 = R.id.viewColour03;
                                        if (w.k(inflate, R.id.viewColour03) != null) {
                                            i2 = R.id.viewColour10;
                                            if (w.k(inflate, R.id.viewColour10) != null) {
                                                i2 = R.id.viewColour11;
                                                if (w.k(inflate, R.id.viewColour11) != null) {
                                                    i2 = R.id.viewColour12;
                                                    if (w.k(inflate, R.id.viewColour12) != null) {
                                                        i2 = R.id.viewColour13;
                                                        if (w.k(inflate, R.id.viewColour13) != null) {
                                                            i2 = R.id.viewColour20;
                                                            if (w.k(inflate, R.id.viewColour20) != null) {
                                                                i2 = R.id.viewColour21;
                                                                if (w.k(inflate, R.id.viewColour21) != null) {
                                                                    i2 = R.id.viewColour22;
                                                                    if (w.k(inflate, R.id.viewColour22) != null) {
                                                                        i2 = R.id.viewColour23;
                                                                        if (w.k(inflate, R.id.viewColour23) != null) {
                                                                            i2 = R.id.viewColour30;
                                                                            if (w.k(inflate, R.id.viewColour30) != null) {
                                                                                i2 = R.id.viewColour31;
                                                                                if (w.k(inflate, R.id.viewColour31) != null) {
                                                                                    i2 = R.id.viewColour32;
                                                                                    if (w.k(inflate, R.id.viewColour32) != null) {
                                                                                        i2 = R.id.viewColour33;
                                                                                        if (w.k(inflate, R.id.viewColour33) != null) {
                                                                                            a aVar = new a(getContext());
                                                                                            ((d) aVar.L).f8359d = getTitle();
                                                                                            aVar.x((ConstraintLayout) inflate);
                                                                                            aVar.u(R.string.cancel, new m(4));
                                                                                            g y10 = aVar.y();
                                                                                            a1 a1Var = new a1(0, constraintLayout);
                                                                                            x1 x1Var = new x1(20);
                                                                                            i iVar = i.f13545b0;
                                                                                            f fVar = new f(new h(a1Var, x1Var), (char) 0);
                                                                                            while (fVar.hasNext()) {
                                                                                                ((View) fVar.next()).setOnClickListener(new bi.b(3, this, y10));
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
