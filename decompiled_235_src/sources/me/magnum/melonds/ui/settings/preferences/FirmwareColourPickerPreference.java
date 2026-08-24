package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwareColourPickerPreference extends Preference {
    public static final List B = hf.c0(6390426, 12208384, 16449560, 16485115, 16486912, 15983360, 11205376, 64256, 41528, 4840330, 3193587, 23027, 146, 9044179, 13828331, 16449682, 16777215, 1184792, 58879, 16766720, 14684511, 58998, 16739904, 6627327);
    public View A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareColourPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_firmware_colour_picker_colour);
    }

    public final void e(int i) {
        int intValue;
        List list = B;
        Integer num = (Integer) gt0.K0(i, list);
        if (num != null) {
            intValue = num.intValue();
        } else {
            intValue = ((Number) list.get(0)).intValue();
        }
        long j = 4278190080L | intValue;
        View view = this.A;
        if (view != null) {
            if (view != null) {
                view.setBackgroundColor((int) j);
            } else {
                nb3.a0("viewSelectedColour");
                throw null;
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View q = x15Var.q(R.id.viewSelectedColour);
        q.getClass();
        this.A = q;
        e(getPersistedInt(0));
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_colour_picker, (ViewGroup) null, false);
        int i = R.id.layoutColourRow0;
        if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow0)) != null) {
            i = R.id.layoutColourRow1;
            if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow1)) != null) {
                i = R.id.layoutColourRow2;
                if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow2)) != null) {
                    i = R.id.layoutColourRow3;
                    if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow3)) != null) {
                        i = R.id.layoutColourRow4;
                        if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow4)) != null) {
                            i = R.id.layoutColourRow5;
                            if (((LinearLayout) gi2.B(inflate, R.id.layoutColourRow5)) != null) {
                                i = R.id.layoutGridColours;
                                ConstraintLayout constraintLayout = (ConstraintLayout) gi2.B(inflate, R.id.layoutGridColours);
                                if (constraintLayout != null) {
                                    i = R.id.viewColour00;
                                    if (gi2.B(inflate, R.id.viewColour00) != null) {
                                        i = R.id.viewColour01;
                                        if (gi2.B(inflate, R.id.viewColour01) != null) {
                                            i = R.id.viewColour02;
                                            if (gi2.B(inflate, R.id.viewColour02) != null) {
                                                i = R.id.viewColour03;
                                                if (gi2.B(inflate, R.id.viewColour03) != null) {
                                                    i = R.id.viewColour10;
                                                    if (gi2.B(inflate, R.id.viewColour10) != null) {
                                                        i = R.id.viewColour11;
                                                        if (gi2.B(inflate, R.id.viewColour11) != null) {
                                                            i = R.id.viewColour12;
                                                            if (gi2.B(inflate, R.id.viewColour12) != null) {
                                                                i = R.id.viewColour13;
                                                                if (gi2.B(inflate, R.id.viewColour13) != null) {
                                                                    i = R.id.viewColour20;
                                                                    if (gi2.B(inflate, R.id.viewColour20) != null) {
                                                                        i = R.id.viewColour21;
                                                                        if (gi2.B(inflate, R.id.viewColour21) != null) {
                                                                            i = R.id.viewColour22;
                                                                            if (gi2.B(inflate, R.id.viewColour22) != null) {
                                                                                i = R.id.viewColour23;
                                                                                if (gi2.B(inflate, R.id.viewColour23) != null) {
                                                                                    i = R.id.viewColour30;
                                                                                    if (gi2.B(inflate, R.id.viewColour30) != null) {
                                                                                        i = R.id.viewColour31;
                                                                                        if (gi2.B(inflate, R.id.viewColour31) != null) {
                                                                                            i = R.id.viewColour32;
                                                                                            if (gi2.B(inflate, R.id.viewColour32) != null) {
                                                                                                i = R.id.viewColour33;
                                                                                                if (gi2.B(inflate, R.id.viewColour33) != null) {
                                                                                                    i = R.id.viewColour40;
                                                                                                    if (gi2.B(inflate, R.id.viewColour40) != null) {
                                                                                                        i = R.id.viewColour41;
                                                                                                        if (gi2.B(inflate, R.id.viewColour41) != null) {
                                                                                                            i = R.id.viewColour42;
                                                                                                            if (gi2.B(inflate, R.id.viewColour42) != null) {
                                                                                                                i = R.id.viewColour43;
                                                                                                                if (gi2.B(inflate, R.id.viewColour43) != null) {
                                                                                                                    i = R.id.viewColour50;
                                                                                                                    if (gi2.B(inflate, R.id.viewColour50) != null) {
                                                                                                                        i = R.id.viewColour51;
                                                                                                                        if (gi2.B(inflate, R.id.viewColour51) != null) {
                                                                                                                            i = R.id.viewColour52;
                                                                                                                            if (gi2.B(inflate, R.id.viewColour52) != null) {
                                                                                                                                i = R.id.viewColour53;
                                                                                                                                if (gi2.B(inflate, R.id.viewColour53) != null) {
                                                                                                                                    zb zbVar = new zb(getContext());
                                                                                                                                    ((wb) zbVar.L).d = getTitle();
                                                                                                                                    zbVar.A((ConstraintLayout) inflate);
                                                                                                                                    zbVar.x(R.string.cancel, new qo0(3));
                                                                                                                                    ac B2 = zbVar.B();
                                                                                                                                    ev evVar = new ev(constraintLayout, 5);
                                                                                                                                    bz1 bz1Var = new bz1(5);
                                                                                                                                    tb6 tb6Var = tb6.d0;
                                                                                                                                    oc2 oc2Var = new oc2(new qd2(evVar, bz1Var));
                                                                                                                                    while (oc2Var.hasNext()) {
                                                                                                                                        ((View) oc2Var.next()).setOnClickListener(new tc2(this, B2, 0));
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
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
