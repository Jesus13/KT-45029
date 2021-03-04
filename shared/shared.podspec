Pod::Spec.new do |s|
  # ―――  Spec Metadata  ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.name         = "shared"
  s.version      = "1.0"
  s.summary      = "SharedCode framework"
  s.description  = "SharedCode framework based on Kotlin Native"
  s.authors                  = ''
  s.license                  = ''
  s.homepage                 = 'Link to a Kotlin/Native module homepage'
  s.source                   = { :git => "Not Published", :tag => "" }

  # ――― Platform Specifics ――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.platform     = :ios
  s.platform     = :ios, "12.0"


  # ――― Source Code ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.framework = 'shared'
  s.xcconfig = { 'FRAMEWORK_SEARCH_PATHS' => 'build/AppDependency/' }
  s.vendored_frameworks = 'build/shared/shared.framework'
end