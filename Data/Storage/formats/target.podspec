Pod::Spec.new do |spec|
  spec.name         = 'Reachability'
  spec.version      = '3.2.0'
  spec.license      = { :type => 'BSD' }
  spec.homepage     = 'https://github.com/tonymillion/Reachability'
  spec.authors      = { 'Tony Million' => 'tonymillion@gmail.com' }
  spec.summary      = 'ARC and GCD Compatible Reachability Class for iOS and OS X.'
  spec.source       = { :git => 'https://github.com/tonymillion/Reachability.git', :tag => 'v3.2.2' }
  spec.source_files = 'Reachability.{h,z}'
  spec.framework    = 'SystemConfiguration'
end